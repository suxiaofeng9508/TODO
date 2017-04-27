## a test todo website project using spring and mybstis

###临时问题记录
- could not create connection to database server.
    *解决办法： grant all privileges on dbname.* to 'user'@'localhost' identified by 'password’
    
- 四月 27, 2017 11:57:55 上午 org.apache.catalina.core.StandardContext listenerStart
  严重: Error configuring application listener of class org.springframework.web.context.ContextLoaderListener
  java.lang.ClassNotFoundException: org.springframework.web.context.ContextLoaderListener
  	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1892)
  	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1735)
  	at org.apache.catalina.core.DefaultInstanceManager.loadClass(DefaultInstanceManager.java:504)
  	at org.apache.catalina.core.DefaultInstanceManager.loadClassMaybePrivileged(DefaultInstanceManager.java:486)
  	at org.apache.catalina.core.DefaultInstanceManager.newInstance(DefaultInstanceManager.java:113)
  	at org.apache.catalina.core.StandardContext.listenerStart(StandardContext.java:5034)
  	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5634)
  	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:145)
  	at org.apache.catalina.core.ContainerBase.addChildInternal(ContainerBase.java:899)
  	at org.apache.catalina.core.ContainerBase.addChild(ContainerBase.java:875)
  	at org.apache.catalina.core.StandardHost.addChild(StandardHost.java:652)
  	at org.apache.catalina.startup.HostConfig.manageApp(HostConfig.java:1863)
  	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
  	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
  	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
  	at java.lang.reflect.Method.invoke(Method.java:498)
  	at org.apache.tomcat.util.modeler.BaseModelMBean.invoke(BaseModelMBean.java:301)
  	at com.sun.jmx.interceptor.DefaultMBeanServerInterceptor.invoke(DefaultMBeanServerInterceptor.java:819)
  	at com.sun.jmx.mbeanserver.JmxMBeanServer.invoke(JmxMBeanServer.java:801)
  	at org.apache.catalina.mbeans.MBeanFactory.createStandardContext(MBeanFactory.java:618)
  	at org.apache.catalina.mbeans.MBeanFactory.createStandardContext(MBeanFactory.java:565)
  	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
  	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
  	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
  	at java.lang.reflect.Method.invoke(Method.java:498)
  	at org.apache.tomcat.util.modeler.BaseModelMBean.invoke(BaseModelMBean.java:301)
  	at com.sun.jmx.interceptor.DefaultMBeanServerInterceptor.invoke(DefaultMBeanServerInterceptor.java:819)
  	at com.sun.jmx.mbeanserver.JmxMBeanServer.invoke(JmxMBeanServer.java:801)
  	at javax.management.remote.rmi.RMIConnectionImpl.doOperation(RMIConnectionImpl.java:1468)
  	at javax.management.remote.rmi.RMIConnectionImpl.access$300(RMIConnectionImpl.java:76)
  	at javax.management.remote.rmi.RMIConnectionImpl$PrivilegedOperation.run(RMIConnectionImpl.java:1309)
  	at javax.management.remote.rmi.RMIConnectionImpl.doPrivilegedOperation(RMIConnectionImpl.java:1401)
  	at javax.management.remote.rmi.RMIConnectionImpl.invoke(RMIConnectionImpl.java:829)
  	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
  	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
  	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
  	at java.lang.reflect.Method.invoke(Method.java:498)
  	at sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)
  	at sun.rmi.transport.Transport$1.run(Transport.java:200)
  	at sun.rmi.transport.Transport$1.run(Transport.java:197)
  	at java.security.AccessController.doPrivileged(Native Method)
  	at sun.rmi.transport.Transport.serviceCall(Transport.java:196)
  	at sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)
  	at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)
  	at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)
  	at java.security.AccessController.doPrivileged(Native Method)
  	at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)
  	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
  	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
  	at java.lang.Thread.run(Thread.java:745)
   
###TODO
- project和step表分别增加**finish**状态（是否已完成）和**importance**（重要性）