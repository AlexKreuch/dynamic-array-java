    public class MyDynamicArray{
        private static final int minCapacity = 10;
        private int cursor;
        private int[] values;
        
        public MyDynamicArray(){
            cursor = 0;
            values = new int[minCapacity];
        }
        
        public void set(int index, int val)
        {
            // if the index is out of range, throw an exception
            if(index<0 || index>=cursor)
                throw new IndexOutOfBoundsException();
            
            // reset value at the index
            values[index] = val;
        }
        
        public int get(int index)
        {
             // if the index is out of range, throw an exception
            if(index<0 || index>=cursor)
                throw new IndexOutOfBoundsException();
            
            // return the value at the index
            return values[index];
        }
        
        public void append(int val)
        {
            // if the array is full, then expand it
            adjustSize();
            
            // add the item and update the cursor
            values[cursor++] = val;
        }
        
        public int getSize(){
            // return the size (not the capacity) of the array
            return cursor;
        }
        
        private void adjustSize(){
            // if the array is full, then double the size
            if(cursor==values.length-1)
            {
                // create a new array
                int[] newVals = new int[2*values.length];
                // copy over the values
                for(int i=0; i<values.length; i++)
                    newVals[i]=values[i];
                // replace the array
                values = newVals;
            }
        }
        
        
    };
    
   
    



