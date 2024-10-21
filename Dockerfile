# 1. 베이스 이미지로 OpenJDK 17 사용
FROM eclipse-temurin:17-jdk-alpine

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. Gradle 빌드 후 생성된 JAR 파일을 Docker 이미지에 복사 (이름이 동적일 경우)
COPY build/libs/*.jar /app/cicd.jar

# 4. 포트 설정 (Spring Boot 기본 포트는 8080)
EXPOSE 8080

# 5. 애플리케이션 실행 명령어 설정
ENTRYPOINT ["java", "-jar", "/app/cicd.jar"]
