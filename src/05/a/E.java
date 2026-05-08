public class E extends D { 
        void check (E e, D d) { 
            x = 5; // (5) 
            d.x = 6; // (6) 
            e.x = 7; // (7) 
            y = 8; // (8) 
            d.y = 9; // (9) 
            e.y = 10; // (10) 
        } 
} 