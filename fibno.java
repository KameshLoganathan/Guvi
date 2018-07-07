import java.io.*;
import java.util.*;
class swap
{
int f = 0;
        int g = 1;
        for(int i = 1; i <= 10; i++)
        {
            f = f + g;
            g = f - g;
            System.out.print(f + " ");
        }

        System.out.println();
    }
}
