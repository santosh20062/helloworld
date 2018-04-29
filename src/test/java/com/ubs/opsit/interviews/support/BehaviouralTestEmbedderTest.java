package com.ubs.opsit.interviews.support;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class BehaviouralTestEmbedderTest {
	
	@InjectMocks
	BehaviouralTestEmbedder behaviouralTestEmbedder = BehaviouralTestEmbedder.aBehaviouralTestRunner();
	
	
	@Before
	public void beforeInit(){
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test(expected = Exception.class)
	public void test_run_shouldSucceed() throws Exception{
		//given
		 List<String> paths = behaviouralTestEmbedder.createStoryPaths();
		 //when
		 behaviouralTestEmbedder.run();
		
		 doThrow(new Exception()).when(behaviouralTestEmbedder).run();
		 //then
		 verify(behaviouralTestEmbedder,times(1)).createStoryPaths();
		 verify(behaviouralTestEmbedder,times(1)).run();
	}
	
	@Test(expected = Exception.class)
	public void test_usingStepsFrom_shouoldFail(){
	
		//given
		Object stepsSource = null;
		//when
		BehaviouralTestEmbedder behaviouralTestEmbedderNew =  behaviouralTestEmbedder.usingStepsFrom(stepsSource);
		//then
		assertThat(behaviouralTestEmbedderNew).isNotEqualTo(null);
		verify(behaviouralTestEmbedder,times(1)).usingStepsFrom(stepsSource);
	}
	
	@Test(expected = Exception.class)
	public void test_withStory_shouoldFail(){
	
		//given
		String aWildcardStoryFilename = null;
		//when
		BehaviouralTestEmbedder behaviouralTestEmbedderNew =  behaviouralTestEmbedder.withStory(aWildcardStoryFilename);
		//then
		assertThat(behaviouralTestEmbedderNew).isNotEqualTo(null);
		verify(behaviouralTestEmbedder,times(1)).withStory(aWildcardStoryFilename);
	}
}


