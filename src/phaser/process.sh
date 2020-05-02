#!/bin/bash
for file in *.kt; do
  sed -i '/file:JsQualifier/d' $file
  sed -i '/file:Suppress/d' $file
done