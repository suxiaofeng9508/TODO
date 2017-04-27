## a test todo website project using spring and mybstis

###临时问题记录
- could not create connection to database server.
    * 解决办法： grant all privileges on dbname.* to 'user'@'localhost' identified by 'password’
    
- 四月 27, 2017 11:57:55 上午 org.apache.catalina.core.StandardContext listenerStart
  严重: Error configuring application listener of class org.springframework.web.context.ContextLoaderListener
  java.lang.ClassNotFoundException: org.springframework.web.context.ContextLoaderListener
  	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1892)
    * 解决办法：将部署web应用所需的所有jar包复制到out目录下的WEB-INF/lib中
  	   
###TODO
- project和step表分别增加**finish**状态（是否已完成）和**importance**（重要性）