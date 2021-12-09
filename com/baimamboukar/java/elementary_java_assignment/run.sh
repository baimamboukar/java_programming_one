cd class/com/baimamboukar/java/elementary_java_assignment/src/
for classfile in ./*
do
  java "${classfile##*}" 
done