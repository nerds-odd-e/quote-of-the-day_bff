FROM maven:slim
COPY ./ ./
RUN mvn install
CMD mvn spring-boot:run
