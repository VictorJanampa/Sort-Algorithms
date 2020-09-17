def Selection_Sort(array):
    for i in range(len(array)): 
        min_idex = i 
        for j in range(i+1, len(array)): 
            if array[min_idex] > array[j]: 
                min_idex = j   
        array[i], array[min_idex] = array[min_idex], array[i]
    print(array)


      
