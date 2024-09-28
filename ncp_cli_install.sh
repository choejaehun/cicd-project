#!/bin/bash

wget https://www.ncloud.com/api/support/download/files/cli/CLI_1.1.19_20240321.zip
unzip CLI_1.1.19_20240321
cd CLI_1.1.19_20240321/cli_linux/
cp ncloud /usr/bin
echo "ncloud configure"

ACCESS_KEY=$(ncloud secretmanager get-secret-value --secret-name NCP_ACCESS_KEY --query 'SecretString' --output text)
SECRET_KEY=$(ncloud secretmanager get-secret-value --secret-name NCP_SECRET_KEY --query 'SecretString' --output text)
export NCLOUD_ACCESS_KEY=$ACCESS_KEY
export NCLOUD_SECRET_KEY=$SECRET_KEY
echo "Key 적용 완료"

curl -X GET "https://kr.object.ncloudstorage.com/jenkins-plugin/natgw.tf" \
     -H "X-NCP-Access-Key: $NCLOUD_ACCESS_KEY" \
     -H "X-NCP-Secret-Key: $NCLOUD_SECRET_KEY" \
     -o /root/natgw.tf
cd /root
echo "Bucket 다운로드 완료" 