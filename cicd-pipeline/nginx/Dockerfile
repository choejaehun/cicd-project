FROM bitnami/nginx:latest

# 필요한 디렉터리를 생성하고 권한 설정
RUN mkdir -p /tmp/nginx/client_temp && chmod -R 777 /tmp/nginx

# 커스텀 nginx.conf 파일을 NGINX 설정 경로로 복사
COPY nginx.conf /opt/bitnami/nginx/conf/nginx.conf

# 커스텀 index.html 파일을 NGINX 기본 HTML 디렉터리에 복사1
COPY index.html /opt/bitnami/nginx/html/index.html
