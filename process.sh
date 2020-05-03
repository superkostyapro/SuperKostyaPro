#!/bin/bash
cd src/Phaser
for file in *.kt; do
  sed -i '/file:JsQualifier/d' $file
  sed -i '/file:Suppress/d' $file
  sed -i 's/^external open class/open external class/' *.kt
done