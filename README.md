# Caesar Cipher
CaesarCipher is a program that encrypts texts files with a given key.
# History and usage
 Caesar Cipher was named after Julius Caesar (100 B.C. – 44 B.C). He would use the cipher for secret communication (protect messages of military significance). The Caesar Cipher is a substitution cipher. Originally, Julius Caesar would use a shift of three to encrypt/decrypt a message. The Caesar Cipher encrypts a message using an affine function : f(x) = 1x + b.
# Description
Caesar Cipher is one of the oldest and simplest forms of encrypting a message. It is a type of substitution cipher where each letter in the original message is replaced with a letter corresponding to a certain number of letters shifted up or down in the alphabet. For each letter of the alphabet, you would take its position in the alphabet, say 3 for the letter 'C', and shift it by the key number. If we had a key of +3, that 'C' would be shifted down to an 'F' - and that same process would be applied to every letter in the plaintext.

# PREVIEW
![ceaser](https://user-images.githubusercontent.com/81568615/128158169-e70f0336-63e1-4233-a62c-bf978da4ba02.gif)



# How shifting works in Ceaser cipher
Plaintext: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG

Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD

# Frequency analysis
Frequency analysis is based on the study of the frequency of letters or groups of letters in a ciphertext. In all languages, different letters are used with different frequencies. For each language proportions of appearance of all characters are slightly different, so texts written in a given language have some certain common properties, which allow to distinguish them from texts written in other languages. In English, E is the most commonly used letter; therefore, in a sufficiently large sample of English text, it is likely that the letter that appears the most frequently in the text will be the letter E.

![freq-of-alpha](https://user-images.githubusercontent.com/81568615/128158317-16697fd2-d586-4bee-ad6d-bb4014ec4053.jpeg)

Frequency of characters in the English alphabet
We can use this property of language to break not just Caesar cipher but any shift cipher. Using the following steps, the plaintext can be retrieved:

## Identify the most common letter in the ciphertext.

## Determine the shift used to make this letter decrypt to an E. For example, E is the fifth letter in the alphabet and, if J is the most common letter and is the tenth letter in the alphabet, the shift used is five.

Decrypt the plaintext using the calculated shift value.

COPYRIGHT TEVIN ISAAC.