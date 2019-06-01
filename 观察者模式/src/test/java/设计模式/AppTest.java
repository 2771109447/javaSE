package 设计模式;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import 设计模式.interr.Observer;
import 设计模式.model.ObserverImpl_dog;
import 设计模式.model.ObserverImpl_mouse;
import 设计模式.model.Subject;
import 设计模式.model.SubjectExtend_cat;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Subject cat=new SubjectExtend_cat();
        Observer dog=new ObserverImpl_dog();
        Observer mouse=new ObserverImpl_mouse();

        cat.attach(dog);
        cat.attach(mouse);
        cat.cry();
    }
}
