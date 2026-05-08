public class D { 
        private int x; 
        protected int y; 
        void check (D d) { 
            d = 1; // (1) 
            d.x = 2; // (2) 
            y = 3; // (3) 
            d.y = 4; // (4) 
        } 
} 