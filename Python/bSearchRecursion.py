def bsearch(list, x, n, val):
   if (n < x):
      return None
   else:
      midval = x + ((n - x) // 2)
   if list[midval] > val:
      return bsearch(list, x, midval-1,val)
   else if list[midval] < val:
      return bsearch(list, midval+1, n, val)
   else:
      return midval
list = [7,61,24,56,88,145]
print(bsearch(list, 0, 5, 24))
print(bsearch(list, 0, 5, 57))