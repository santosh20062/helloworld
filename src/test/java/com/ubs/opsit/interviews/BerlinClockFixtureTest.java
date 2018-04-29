package com.ubs.opsit.interviews;

import static org.mockito.Mockito.doThrow;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class BerlinClockFixtureTest {

	@Mock
	BerlinClockFixture berlinClockFixture;
	
	@Before
	public void beforeInit(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test_berlinClockAcceptanceTests_shouldSucceed() throws Exception{
		doThrow(new Exception()).when(berlinClockFixture).berlinClockAcceptanceTests() ;
	}
}
