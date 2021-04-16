import csv
with open('filecsv_1.csv') as filecsv:
    rs = csv.reader(filecsv)
    demdong = 0
    for row in rs:
        if demdong == 0:
            print(f'Ten cac cot: {",".join(row)}')
            demdong +=1
        else:
            print(f'{row[0]}\t{row[1]}\t{row[2]}\t{row[3]}')
filecsv.close()
print('Done')