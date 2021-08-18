该项目是 SpringBoot + AWS SQS + Spring JMS 的收发信息的 Demo。
Using Amazon SQS with Spring Boot And Spring JMS。

## 配置 (Setting)
在文件 sqs.properties 上配置 aws Access keys。在文件 application.properties 中配置 queue 的名称
Setting Aws Access Key in `sqs.properties`. Setting queue name in `application.properties`.

## 启动 (Startup)
启动项目后， 使用链接 `http://localhost:8080/send/demo?points=111&title=xxx` 便能进行信息的发送。 points 后面为数字，title 为 String 类型。
After startup, using `http://localhost:8080/send/demo?points=111&title=xxx` to send message. the type of points in url param is numeric, title is String.

