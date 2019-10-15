package com.company;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class FractionTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Fraction.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

    }

    @Test
    public void getTop() {
        Fraction temp = new Fraction(1,2);
        Fraction temp1 = new Fraction(3,4);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(temp.getBottom());
        expected.add(temp1.getBottom());

        ArrayList<Integer> actual = new ArrayList<Integer>();
        actual.add(2);
        actual.add(4);

        Assert.assertEquals(expected, actual);

    }
}
