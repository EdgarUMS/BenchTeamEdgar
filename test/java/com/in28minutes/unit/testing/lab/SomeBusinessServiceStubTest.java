package com.in28minutes.unit.testing.lab;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.in28minutes.unit.testing.lab.others.SomeDataService;

public class SomeBusinessServiceStubTest {
		
	@Test
	public void testCalculateSum() {	
		
		SomeDataService dataService = new SomeDataService() {
			public int[] retrieveData() {
				return new int[] {10,20};
			}
		};
		SomeBusinessService businessService = new SomeBusinessService(dataService);
		assertEquals(30,businessService.calculateSum() );
	}
	
	@Test
	public void testCalculateSum_OneElement() {	
		
		SomeDataService dataService = new SomeDataService() {
			public int[] retrieveData() {
				return new int[] {10};
			}
		};
		SomeBusinessService businessService = new SomeBusinessService(dataService);
		assertEquals(10,businessService.calculateSum() );
	}
	
	@Test
	public void testCalculateSum_Null() {
		
		SomeDataService dataService = new SomeDataService() {
			public int[] retrieveData() {
				return new int[] {0};
			}
		};
		SomeBusinessService businessService = new SomeBusinessService(dataService);
		assertEquals(0,businessService.calculateSum() );
	}
	
	
	
}
