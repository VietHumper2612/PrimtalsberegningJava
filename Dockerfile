FROM ubuntu:latest
LABEL authors="theisjensen"

ENTRYPOINT ["top", "-b"]