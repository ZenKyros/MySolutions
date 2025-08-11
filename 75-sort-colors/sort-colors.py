class Solution:
    def sortColors(self, arr: List[int]) -> None:
        l = 0 
        r = len(arr) -1
        m = 0
        n = len(arr)-1 

        while( m <= r ):

            if(arr[m]== 0):
                arr[l] , arr[m] = arr[m] , arr[l]
                l += 1
                m +=1 
            elif(arr[m] ==1):
                m +=1
            else:
                temp = arr[m]
                arr[m] = arr[r]
                arr[r] = temp 
                r -=1 
        



        