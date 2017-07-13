package com.tomar.client;

import com.tomar.packets.Account;
import com.tomar.packets.Address;
import com.tomar.packets.Employee;

import java.util.Date;

/**
 * Created by tomar on 12/07/17.
 */
public class Runner {

   /* @Autowired
    private MessageSender<Employee> sender;

    @Autowired
    private MessageReciver<Employee> reciver;*/

    public static void main(String[] args)  throws InterruptedException{

       /* ApplicationContext context =
                new GenericXmlApplicationContext("classpath:/rabbit-context.xml");

        Runner runner = new Runner();
        runner.test();
*/

    }

/*
    private void test() throws InterruptedException {
        sender.send(createEmployee(1));
        Thread.sleep(5000);
    }
*/

    private static Employee createEmployee(int i){
        return  new Employee("fname"+i,"lname"+i,new Date(),
                new Account(100D+i,200D+i),
                new Address("street "+i,"houseno "+i,"society "+i,
                        "district "+i,"karnatka ","india","560048+i"));
    }
}
