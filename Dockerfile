# Brug officiel Java image
FROM eclipse-temurin:21

# Arbejdsmappe inde i containeren
WORKDIR /app

# Kopier source code
COPY src/Main.java .

# Compile programmet
RUN javac Main.java

# Kør programmet
CMD ["java", "Main"]