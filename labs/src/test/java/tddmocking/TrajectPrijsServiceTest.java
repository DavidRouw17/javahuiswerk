package tddmocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTest {

    @Mock
    private TrajectNaarTrajectEenhedenService trajectNaarTrajectEenhedenService;

    @Mock
    private TrajectEenhedenNaarPrijsService trajectEenhedenNaarPrijsService;

    private TrajectPrijsService trajectPrijsService;

    @BeforeEach
    public void setUp() {
        this.trajectPrijsService = new TrajectPrijsService();
//        this.trajectNaarTrajectEenhedenService = mock(TrajectNaarTrajectEenhedenService.class);
//        this.trajectEenhedenNaarPrijsService = mock(TrajectEenhedenNaarPrijsService.class);
        trajectPrijsService.setTrajectNaarTrajectEenhedenService(this.trajectNaarTrajectEenhedenService);
        trajectPrijsService.setTrajectEenhedenNaarPrijsService(this.trajectEenhedenNaarPrijsService);
    }

    @Test
    void getTrajectPrijs() {


        when(trajectNaarTrajectEenhedenService.getTrajectEenheden(eq("Eindhoven"), eq("Amsterdam"))).thenReturn(7);
        when(trajectEenhedenNaarPrijsService.getPriceTrajectEenheden(eq(7))).thenReturn(3);

        int prijs = trajectPrijsService.getTrajectPrijs("Eindhoven", "Amsterdam");

        assertThat(prijs, is(21));
    }

    @Test
    void getTrajectPrijsNBLocatie() {
        when(trajectNaarTrajectEenhedenService.getTrajectEenheden(eq("brabont"), anyString())).thenThrow(new InvalidLocationException());
        assertThrows(InvalidLocationException.class, () -> trajectPrijsService.getTrajectPrijs("brabont", "Amsterdam"));

    }


}