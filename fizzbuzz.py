# -*- coding: utf-8 -*-
"""
Created on Tue Apr 27 19:26:15 2021

@author: Lenovo
"""

a=int(input("ENter a no :"))
for i in range(1,a):
    if i%2==0 and i%3==0:
        print(i,"FIZZBUZZ")
    elif i%2==0 :
        print(i,"FIzz")
    elif i%3 ==0:
        print(i,"BUZZ")
    else:
        print(i)
    
