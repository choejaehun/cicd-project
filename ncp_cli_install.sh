#!/bin/bash

wget https://www.ncloud.com/api/support/download/files/cli/CLI_1.1.19_20240321.zip
unzip CLI_1.1.19_20240321
cd CLI_1.1.19_20240321/cli_linux/
cp ncloud /usr/bin
ACCESS_KEY=$(ncloud secretmanager get-secret-value --secret-name NCP_ACCESS_KEY --query 'SecretString' --output text)
SECRET_KEY=$(ncloud secretmanager get-secret-value --secret-name NCP_SECRET_KEY --query 'SecretString' --output text)
export NCLOUD_ACCESS_KEY=$ACCESS_KEY
export NCLOUD_SECRET_KEY=$SECRET_KEY
curl -X GET "https://kr.object.ncloudstorage.com/jenkins-plugin/natgw.tf" \
     -H "X-NCP-Access-Key: $NCLOUD_ACCESS_KEY" \
     -H "X-NCP-Secret-Key: $NCLOUD_SECRET_KEY" \
     -o /root/natgw.tf
cd