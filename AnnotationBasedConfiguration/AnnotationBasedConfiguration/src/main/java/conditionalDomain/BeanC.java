package conditionalDomain;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import conditionalCondition.TimeCondition;

@Component
@Conditional(TimeCondition.class)
public class BeanC {

	private LocalDate date;

	@Value("#{T(java.time.LocalDate).now()}")
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BeanC [date=" + date + "]";
	}
}
