from openjdk
COPY ./src/main/java/com/myproject/*.java /

RUN javac /Main.java /Calculator.java

ENTRYPOINT ["java", "Main"]