#!/bin/bash
cd kostya
i=1
for file in *.png; do

  # kostya
  : '
  convert $file -trim $file
  mogrify -resize x300 $file
  mv $file kostya$i.png
  '

  ((i++))
done