Toggle 2 lines in pom.xml to change spring boot version.
		<version>2.0.0.RELEASE</version>
		<!--<version>1.5.10.RELEASE</version>-->
Then after springboot:run test with curl:
>curl -v  -X POST  -u sdass:ab12 "http://localhost:8080/hello?name=Xman"
>curl -v    -u sdass:ab12 "http://localhost:8080/hello?name=Xman"

case 1 spring boot <version>1.5.10.RELEASE</version>
----------------------------------------------------
security.user.name=sdass
security.user.password=ab12

POST and GET both passed.

case 2 spring boot <version>2.0.0.RELEASE</version>
------------------------------------------------
spring.security.user.name=sdass
spring.security.user.password=ab12

GET passed. POST failed.
    On windowns curl [7.33.0 (x86_64-pc-win32)] 302 to http://localhost:8080/login.
    On postman 403 (forbidden)
