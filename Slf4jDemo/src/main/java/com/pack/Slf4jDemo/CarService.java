package com.pack.Slf4jDemo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
   private Logger log= LoggerFactory.getLogger(CarService.class);
   public void process(String msg)
   {
	   if(log.isDebugEnabled())
	   log.debug("The debug process is  :{}",msg);
	   log.error("The error process is  :{}",msg);
	   log.info("The info process is  :{}",msg);
   }
}
