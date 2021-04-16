import csv
from pandas import DataFrame
import pandas as pd
lstcsv = []
index = 0 #cot trong 1 dong 
dong = 0  #dong trong file 
with open("filecsv_1.csv","r") as filecsv:
        rs = csv.reader(filecsv)
        for row in rs:
            if dong == 0:
                print(f'ten cac cot: {",".join(row)}')
                dong +=1
            else:
                lstcsv.append(row)
filecsv.close()
print("Hoan thanh viec tao list")
for cot in range(len(lstcsv)-1):
        if(lstcsv[cot][2]== '0'): #cot nam phat hanh
            lstcsv[cot][2] = '1990'
        if(lstcsv[cot][1] == ''):
            stcsv[cot][1] == "Unknown"
        if(lstcsv[cot][3] == ''):
            lstcsv[cot][3] == '.txt'
print("Da sua loi xong")
df = DataFrame(lstcsv,columns=['Programming Language','Design By','Year','Extenstion'])
rs = df.to_csv("filecsv_2.csv",index="None",header=True) 
print('Ghi file thanh cong')
filecsv = pandas.read-csv('filecsv_2.csv')
print(filecsv)   