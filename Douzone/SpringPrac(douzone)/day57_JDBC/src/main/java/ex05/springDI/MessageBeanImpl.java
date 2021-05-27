package ex05.springDI;

public class MessageBeanImpl implements MessageBean{
	private String name;
	private String greeting;
	
	public MessageBeanImpl() {
		super();
	}
	
	public MessageBeanImpl(String name, String greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}
	
	
	public String getName() {
		return name;
	}
	//setter DI
	public void setName(String name) {
		this.name = name;
	}
	public String getGreeting() {
		return greeting;
	}
	//setter DI
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(greeting + " / "+ name);
		
	}
	

}
