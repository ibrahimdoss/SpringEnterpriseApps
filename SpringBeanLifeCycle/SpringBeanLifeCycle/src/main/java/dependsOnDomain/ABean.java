package dependsOnDomain;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("aBean")
@Lazy
@DependsOn({"zBean"})
public class ABean {
	
	public ABean() {
		System.out.println("in ABean()");
	}
}
