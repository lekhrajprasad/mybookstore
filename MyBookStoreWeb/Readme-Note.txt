BookStoreWeb Microservice
h2database
swagger


option 1:
a) Keep under src/main/resources/META-INF/resources/mycss/bookstore.css
b)Add this path under resource Handlers in Bean Configuration class
	BookStoreWebConfig implements WebMvcConfigurer
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		//When using option 1: of Readme-Note.txt then uncomment the below line.
		//registry.addResourceHandler("/mycss/**").addResourceLocations("classpath:/META-INF/resources/mycss/"); 
	}
c)Include the Css file in the JSP as follows
        <link href="mycss/bookstore.css" rel="stylesheet">

option 2:
a) Keep under src/main/webapp/mycss/bookstore.css
b)Includ the Css file in the JSP as follows
        <link href="mycss/bookstore.css" rel="stylesheet">
        
        
To add reting use below data to avoid PRIMARY KEY CONSTRAINTS VIOLATION EXCEPTIONS
U-12
103