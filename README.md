
1. Spring Starter Project 생성

	- Name : MosaicWeb
	- Type : Gradle(Buildship)
	- Packaging : war
	- Group : com.hybrid
	- Artifact : MosaicWeb
	- Package : com.hybrid
	
	- Dependencies : web 선택

2. 형상관리
	- Remote Repository 생성(github)
	- Local Repository 생성
		- >> git status
		- >> git log
		- >> dir /A > .gitignore
		- >> notepad .gitignore 편집
		- >> git init
		- >> git add *
		- >> git commit -m "first commit"
	- Local ==> Remote push(최초 동기화)
		- >> git remote -v
		- >> git remote remove origin
		- >> git remote add origin https://github.com/webprotols/MosaicWeb.git
		- >> git push -u origin master

	
	- 개발자 2가 Clone 수행
		- >> git clone https://github.com/webprotols/MosaicWeb.git
		- >> git clone https://github.com/webprotols/MosaicWeb.git MosaicWebDev
		- >> Eclipse Gradle Import
	
3. HTML 설정
	- 설정 불필요
	- mkdir src/main/webapp 폴더 생성
	- notepad src/main/webapp/Hello.html
	- gradle bootRun
	- Firefox ==> http://localhost:8080/Hello.html
	
4. JSP 설정
	- mvnrepository.com >> search : tomcat jasper
	- build.gradle dependency : 
		providedRuntime group: 'org.apache.tomcat.embed', name: 'tomcat-embed-jasper', version: '8.5.4'
	- Eclipse -> Gradle Refresh	
	- notepad src/main/webapp/Hello.jsp
	- gradle bootRun
	- Firefox ==> http://localhost:8080/Hello.jsp	
	
5. Servlet 설정
	- Project facets 추가
		- >> Dynamic Web Module 3.1
		- >> Java 1.8
		- >> JavaScript 1.0
	- MosaicWebApplication.java << @ServletComponentScan 추가
	- com.hybrid.servlet.HelloServlet.java 생성
	- gradle bootRun
	- Firefox ==> http://localhost:8080/HelloServlet		
	
6. SpringLoaded 설정(리로드 기능)
	- mvnrepository.com >> search : springloaded
	- build.gradle에 설정(두 곳)
		classpath("org.springframework:springloaded:1.2.6.RELEASE")
		compile group: 'org.springframework', name: 'springloaded', version: '1.2.6.RELEASE'
	- Elipse Output Directory 변경
		bin ==> build/classes/main
		
7. Mybatis 설정
	- mvnrepository.com >> search : spring boot mybatis
	- build.gradle에 Dependency 설정
		compile group: 'org.mybatis.spring.boot', name: 'mybatis-spring-boot-starter', version: '1.1.1'
		compile files('src/main/webapp/WEB-INF/lib/ojdbc7.jar');
	- application.properties
		- >> spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
		- >> spring.datasource.url=jdbc:oracle:thin:@52.78.98.79:1521:orcl
		- >> spring.datasource.username=scott
		- >> spring.datasource.password=tiger
	- Eclipse Gradle Refresh 수행	
	- gradle bootRun
	
	- notepad src/main/java/com/hybrid/mapper/DeptMapper.java 인터페이스 생성
	- notepad src/main/java/com/hybrid/domain/Dept.java
	- notepad src/test/java/com/hybrid/mapper/DeptMapperTest.java
	- notepad src/main/webapp/dept.jsp
	
8. Deploy 방법
	- gradle war
	- build/libs/MosaicWeb~~~~~~.war
	- cp MosaicWeb.war C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps
	- Firefox ==> http://localhost/MosaicWeb/index.html
	
9. Gluon 설정	
	- cp FXTemplate/src/* MosaicWeb/src
	- merge FXTemplate/build.gradle MosaicWeb/build.gradle
	- merge com.hybrid.fx.MainApplication com.hybrid.MosaicWebApplication
		->> spring boot + gluon start
		->> spring boot + gluon stop
		->> PrimaryView 에 WebView 추가

	
10.SiteMesh 설정
	
	
	
	
	
	
			
	
	
	
	
	
	
	
	