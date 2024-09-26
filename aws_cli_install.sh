#!/bin/bash
sudo yum install -y awscli
aws configure

# Secrets Manager에서 Access Key와 Secret Key 가져오기
ACCESS_KEY=$(ncloud secretsmanager get-secret-value --secret-id ncp-credentials --query 'SecretString' --output text | jq -r .NCP_ACCESS_KEY)
SECRET_KEY=$(ncloud secretsmanager get-secret-value --secret-id ncp-credentials --query 'SecretString' --output text | jq -r .NCP_SECRET_KEY)

# 환경 변수로 설정
export NCP_ACCESS_KEY=$ACCESS_KEY
export NCP_SECRET_KEY=$SECRET_KEY

# AWS CLI 또는 다른 명령어에서 사용할 수 있도록 설정
aws configure set aws_access_key_id $NCP_ACCESS_KEY
aws configure set aws_secret_access_key $NCP_SECRET_KEY

aws --endpoint-url=https://kr.object.ncloudstorage.com s3 cp s3://jenkins-plugin/natgw.tf .