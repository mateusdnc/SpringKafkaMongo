FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copiar o JAR gerado
COPY target/*.jar app.jar

# Expor a porta padrão do Spring Boot
EXPOSE 8080

# Variáveis de ambiente padrão
ENV JAVA_OPTS="-Xmx512m -Xms256m"

# Comando para executar a aplicação
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]