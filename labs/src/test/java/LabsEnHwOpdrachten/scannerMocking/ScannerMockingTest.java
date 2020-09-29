package LabsEnHwOpdrachten.scannerMocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ScannerMockingTest {

    ScannerMocking invoer;

    @Mock
    ScannerWrap nepScanner;
    @BeforeEach
    void setUp() {
        invoer = new ScannerMocking();
    }

    @Test
    void returnWhatWasScanned() {
        invoer.setWrap(nepScanner);
        when(nepScanner.wrapNextLine()).thenReturn("Dit is invoer!");

        String s = invoer.returnWhatWasScanned();
        assertThat(s, containsString("Dit is invoer!"));
    }
}