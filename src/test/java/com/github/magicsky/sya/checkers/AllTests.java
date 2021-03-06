package com.github.magicsky.sya.checkers;

import com.github.magicsky.sya.checkers.risk.BufferOverflowFunctionCheckerTest;
import com.github.magicsky.sya.checkers.style.DefineGuardChecker;
import com.github.magicsky.sya.checkers.style.SmartPointerCheckerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    SmartPointerCheckerTest.class,
    BufferOverflowFunctionCheckerTest.class,
    DefineGuardChecker.class
})

/**
 * @author 
 */
public class AllTests {

}
