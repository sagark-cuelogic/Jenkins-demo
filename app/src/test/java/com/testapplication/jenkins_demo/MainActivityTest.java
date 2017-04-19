package com.testapplication.jenkins_demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by sagarkudale on 19/04/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest {

    @Mock
    IMainView view;

    @Mock
    IMainAPI api;

    MainPresenter presenter;

    @Before
    public void setUp() throws Exception {

        presenter = new MainPresenter(view, api);
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void sampleTestWithValidUsername() {
        when(view.getUserName()).thenReturn("saga");

        presenter.validateUserName();

        verify(view).validUsername();
    }

}