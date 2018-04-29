package com.ubs.opsit.interviews.support;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ClasspathStoryFinderTest {

	@InjectMocks
	ClasspathStoryFinder classpathStoryFinder;
	
	@Before
	public void beforeInit(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testfindFilenamesThatMatch_String_shouldSucceed(){
		//given	
		String fileName= "test1.txt";
		//when
		List<String> listFile =  classpathStoryFinder.findFilenamesThatMatch(fileName);
		//then	
		assertThat(listFile.isEmpty());	
		
	}
}
