package org.icddrb.suchana;

 
   / / A n d r o i d   M a n i f e s t   C o d e 
 
   / / < a c t i v i t y   a n d r o i d : n a m e = " . C o s t 1 "   a n d r o i d : l a b e l = " C o s t 1 "   / > 
 
   i m p o r t   j a v a . t e x t . P a r s e E x c e p t i o n ; 
 
   i m p o r t   j a v a . t e x t . S i m p l e D a t e F o r m a t ; 
 
   i m p o r t   j a v a . u t i l . A r r a y L i s t ; 
 
   i m p o r t   j a v a . u t i l . C a l e n d a r ; 
 
   i m p o r t   j a v a . u t i l . D a t e ; 
 
   i m p o r t   j a v a . u t i l . H a s h M a p ; 
 
   i m p o r t   j a v a . u t i l . L i s t ; 
 
   i m p o r t   a n d r o i d . a p p . * ; 
 
   i m p o r t   a n d r o i d . a p p . A l e r t D i a l o g ; 
 
   i m p o r t   a n d r o i d . a p p . D a t e P i c k e r D i a l o g ; 
 
   i m p o r t   a n d r o i d . a p p . D i a l o g ; 
 
   i m p o r t   a n d r o i d . a p p . T i m e P i c k e r D i a l o g ; 
 
   i m p o r t   a n d r o i d . c o n t e n t . C o n t e x t ; 
 
   i m p o r t   a n d r o i d . c o n t e n t . D i a l o g I n t e r f a c e ; 
 
   i m p o r t   a n d r o i d . c o n t e n t . I n t e n t ; 
 
   i m p o r t   a n d r o i d . d a t a b a s e . C u r s o r ; 
 
   i m p o r t   a n d r o i d . l o c a t i o n . L o c a t i o n ; 
 
   i m p o r t   a n d r o i d . l o c a t i o n . L o c a t i o n L i s t e n e r ; 
 
   i m p o r t   a n d r o i d . l o c a t i o n . L o c a t i o n M a n a g e r ; 
 
   i m p o r t   a n d r o i d . n e t . U r i ; 
 
   i m p o r t   a n d r o i d . p r o v i d e r . S e t t i n g s ; 
 
   i m p o r t   a n d r o i d . v i e w . K e y E v e n t ; 
 
   i m p o r t   a n d r o i d . o s . B u n d l e ; 
 
   i m p o r t   a n d r o i d . v i e w . M e n u ; 
 
   i m p o r t   a n d r o i d . v i e w . M e n u I n f l a t e r ; 
 
   i m p o r t   a n d r o i d . v i e w . M e n u I t e m ; 
 
   i m p o r t   a n d r o i d . v i e w . V i e w ; 
 
   i m p o r t   a n d r o i d . v i e w . M o t i o n E v e n t ; 
 
   i m p o r t   a n d r o i d . v i e w . V i e w . O n F o c u s C h a n g e L i s t e n e r ; 
 
   i m p o r t   a n d r o i d . v i e w . V i e w G r o u p ; 
 
   i m p o r t   a n d r o i d . v i e w . L a y o u t I n f l a t e r ; 
 
   i m p o r t   a n d r o i d . w i d g e t . A d a p t e r V i e w ; 
 
   i m p o r t   a n d r o i d . w i d g e t . B u t t o n ; 
 
   i m p o r t   a n d r o i d . w i d g e t . C h e c k B o x ; 
 
   i m p o r t   a n d r o i d . w i d g e t . D a t e P i c k e r ; 
 
   i m p o r t   a n d r o i d . w i d g e t . E d i t T e x t ; 
 
   i m p o r t   a n d r o i d . w i d g e t . I m a g e B u t t o n ; 
 
   i m p o r t   a n d r o i d . w i d g e t . L i n e a r L a y o u t ; 
 
   i m p o r t   a n d r o i d . w i d g e t . R a d i o B u t t o n ; 
 
   i m p o r t   a n d r o i d . w i d g e t . R a d i o G r o u p ; 
 
   i m p o r t   a n d r o i d . w i d g e t . L i s t V i e w ; 
 
   i m p o r t   a n d r o i d . w i d g e t . S i m p l e A d a p t e r ; 
 
   i m p o r t   a n d r o i d . w i d g e t . B a s e A d a p t e r ; 
 
   i m p o r t   a n d r o i d . w i d g e t . S p i n n e r ; 
 
   i m p o r t   a n d r o i d . w i d g e t . T e x t V i e w ; 
 
   i m p o r t   a n d r o i d . w i d g e t . T i m e P i c k e r ; 
 
   i m p o r t   a n d r o i d . w i d g e t . A r r a y A d a p t e r ; 
 
   i m p o r t   C o m m o n . * ; 
 
 
 
   p u b l i c   c l a s s   C o s t 1   e x t e n d s   A c t i v i t y   { 
 
         b o o l e a n   n e t w o r k A v a i l a b l e = f a l s e ; 
 
         L o c a t i o n   c u r r e n t L o c a t i o n ;   
 
         d o u b l e   c u r r e n t L a t i t u d e , c u r r e n t L o n g i t u d e ;   
 
         / / D i s a b l e d   B a c k / H o m e   k e y 
 
         / / - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
 
         @ O v e r r i d e   
 
         p u b l i c   b o o l e a n   o n K e y D o w n ( i n t   i K e y C o d e ,   K e y E v e n t   e v e n t ) 
 
         { 
 
                 i f ( i K e y C o d e   = =   K e y E v e n t . K E Y C O D E _ B A C K   | |   i K e y C o d e   = =   K e y E v e n t . K E Y C O D E _ H O M E )   
 
                           {   r e t u r n   f a l s e ;   } 
 
                 e l s e   {   r e t u r n   t r u e ;     } 
 
         } 
 
         S t r i n g   V a r i a b l e I D ; 
 
         p r i v a t e   i n t   h o u r ; 
 
         p r i v a t e   i n t   m i n u t e ; 
 
         p r i v a t e   i n t   m D a y ; 
 
         p r i v a t e   i n t   m M o n t h ; 
 
         p r i v a t e   i n t   m Y e a r ; 
 
         s t a t i c   f i n a l   i n t   D A T E _ D I A L O G   =   1 ; 
 
         s t a t i c   f i n a l   i n t   T I M E _ D I A L O G   =   2 ; 
 
 
 
         C o n n e c t i o n   C ; 
 
         G l o b a l   g ; 
 
         S i m p l e A d a p t e r   d a t a A d a p t e r ; 
 
         A r r a y L i s t < H a s h M a p < S t r i n g ,   S t r i n g > >   d a t a L i s t   =   n e w   A r r a y L i s t < H a s h M a p < S t r i n g ,   S t r i n g > > ( ) ; 
 
         s t a t i c   S t r i n g   T a b l e N a m e ; 
 
 
 
         T e x t V i e w   l b l H e a d i n g ; 
 
                   L i n e a r L a y o u t   s e c R n d ; 
 
                   V i e w   l i n e R n d ; 
 
                   T e x t V i e w   V l b l R n d ; 
 
                   E d i t T e x t   t x t R n d ; 
 
                   L i n e a r L a y o u t   s e c S u c h a n a I D ; 
 
                   V i e w   l i n e S u c h a n a I D ; 
 
                   T e x t V i e w   V l b l S u c h a n a I D ; 
 
                   E d i t T e x t   t x t S u c h a n a I D ; 
 
                   L i n e a r L a y o u t   s e c M S l N o ; 
 
                   V i e w   l i n e M S l N o ; 
 
                   T e x t V i e w   V l b l M S l N o ; 
 
                   E d i t T e x t   t x t M S l N o ; 
 
                   L i n e a r L a y o u t   s e c L B H 8 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 1 a ; 
 
                   V i e w   l i n e H 8 1 1 a ; 
 
                   T e x t V i e w   V l b l H 8 1 1 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 1 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 1 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 1 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 1 b ; 
 
                   V i e w   l i n e H 8 1 1 b ; 
 
                   T e x t V i e w   V l b l H 8 1 1 b ; 
 
                   E d i t T e x t   t x t H 8 1 1 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 1 c ; 
 
                   V i e w   l i n e H 8 1 1 c ; 
 
                   T e x t V i e w   V l b l H 8 1 1 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 1 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 1 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 1 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 1 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 1 d ; 
 
                   V i e w   l i n e H 8 1 1 d ; 
 
                   T e x t V i e w   V l b l H 8 1 1 d ; 
 
                   E d i t T e x t   t x t H 8 1 1 d ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 2 a ; 
 
                   V i e w   l i n e H 8 1 2 a ; 
 
                   T e x t V i e w   V l b l H 8 1 2 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 2 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 2 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 2 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 2 b ; 
 
                   V i e w   l i n e H 8 1 2 b ; 
 
                   T e x t V i e w   V l b l H 8 1 2 b ; 
 
                   E d i t T e x t   t x t H 8 1 2 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 2 c ; 
 
                   V i e w   l i n e H 8 1 2 c ; 
 
                   T e x t V i e w   V l b l H 8 1 2 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 2 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 2 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 2 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 2 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 2 d ; 
 
                   V i e w   l i n e H 8 1 2 d ; 
 
                   T e x t V i e w   V l b l H 8 1 2 d ; 
 
                   E d i t T e x t   t x t H 8 1 2 d ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 3 a ; 
 
                   V i e w   l i n e H 8 1 3 a ; 
 
                   T e x t V i e w   V l b l H 8 1 3 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 3 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 3 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 3 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 3 b ; 
 
                   V i e w   l i n e H 8 1 3 b ; 
 
                   T e x t V i e w   V l b l H 8 1 3 b ; 
 
                   E d i t T e x t   t x t H 8 1 3 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 3 c ; 
 
                   V i e w   l i n e H 8 1 3 c ; 
 
                   T e x t V i e w   V l b l H 8 1 3 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 3 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 3 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 3 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 3 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 3 d ; 
 
                   V i e w   l i n e H 8 1 3 d ; 
 
                   T e x t V i e w   V l b l H 8 1 3 d ; 
 
                   E d i t T e x t   t x t H 8 1 3 d ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 4 a ; 
 
                   V i e w   l i n e H 8 1 4 a ; 
 
                   T e x t V i e w   V l b l H 8 1 4 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 4 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 4 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 4 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 4 b ; 
 
                   V i e w   l i n e H 8 1 4 b ; 
 
                   T e x t V i e w   V l b l H 8 1 4 b ; 
 
                   E d i t T e x t   t x t H 8 1 4 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 4 c ; 
 
                   V i e w   l i n e H 8 1 4 c ; 
 
                   T e x t V i e w   V l b l H 8 1 4 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 4 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 4 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 4 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 4 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 4 d ; 
 
                   V i e w   l i n e H 8 1 4 d ; 
 
                   T e x t V i e w   V l b l H 8 1 4 d ; 
 
                   E d i t T e x t   t x t H 8 1 4 d ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 5 a ; 
 
                   V i e w   l i n e H 8 1 5 a ; 
 
                   T e x t V i e w   V l b l H 8 1 5 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 5 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 5 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 5 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 5 b ; 
 
                   V i e w   l i n e H 8 1 5 b ; 
 
                   T e x t V i e w   V l b l H 8 1 5 b ; 
 
                   E d i t T e x t   t x t H 8 1 5 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 5 c ; 
 
                   V i e w   l i n e H 8 1 5 c ; 
 
                   T e x t V i e w   V l b l H 8 1 5 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 5 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 5 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 5 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 5 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 5 d ; 
 
                   V i e w   l i n e H 8 1 5 d ; 
 
                   T e x t V i e w   V l b l H 8 1 5 d ; 
 
                   E d i t T e x t   t x t H 8 1 5 d ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 6 a ; 
 
                   V i e w   l i n e H 8 1 6 a ; 
 
                   T e x t V i e w   V l b l H 8 1 6 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 6 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 6 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 6 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 6 b ; 
 
                   V i e w   l i n e H 8 1 6 b ; 
 
                   T e x t V i e w   V l b l H 8 1 6 b ; 
 
                   E d i t T e x t   t x t H 8 1 6 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 6 c ; 
 
                   V i e w   l i n e H 8 1 6 c ; 
 
                   T e x t V i e w   V l b l H 8 1 6 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 1 6 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 1 6 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 6 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 1 6 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 1 6 d ; 
 
                   V i e w   l i n e H 8 1 6 d ; 
 
                   T e x t V i e w   V l b l H 8 1 6 d ; 
 
                   E d i t T e x t   t x t H 8 1 6 d ; 
 
                   L i n e a r L a y o u t   s e c L B H 8 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 2 1 a ; 
 
                   V i e w   l i n e H 8 2 1 a ; 
 
                   T e x t V i e w   V l b l H 8 2 1 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 2 1 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 2 1 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 2 1 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 2 1 b ; 
 
                   V i e w   l i n e H 8 2 1 b ; 
 
                   T e x t V i e w   V l b l H 8 2 1 b ; 
 
                   E d i t T e x t   t x t H 8 2 1 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 2 1 c ; 
 
                   V i e w   l i n e H 8 2 1 c ; 
 
                   T e x t V i e w   V l b l H 8 2 1 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 2 1 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 2 1 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 2 1 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 2 1 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 2 1 d ; 
 
                   V i e w   l i n e H 8 2 1 d ; 
 
                   T e x t V i e w   V l b l H 8 2 1 d ; 
 
                   E d i t T e x t   t x t H 8 2 1 d ; 
 
                   L i n e a r L a y o u t   s e c L B H 8 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 3 1 a ; 
 
                   V i e w   l i n e H 8 3 1 a ; 
 
                   T e x t V i e w   V l b l H 8 3 1 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 3 1 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 3 1 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 3 1 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 3 1 b ; 
 
                   V i e w   l i n e H 8 3 1 b ; 
 
                   T e x t V i e w   V l b l H 8 3 1 b ; 
 
                   E d i t T e x t   t x t H 8 3 1 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 3 1 c ; 
 
                   V i e w   l i n e H 8 3 1 c ; 
 
                   T e x t V i e w   V l b l H 8 3 1 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 3 1 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 3 1 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 3 1 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 3 1 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 3 1 d ; 
 
                   V i e w   l i n e H 8 3 1 d ; 
 
                   T e x t V i e w   V l b l H 8 3 1 d ; 
 
                   E d i t T e x t   t x t H 8 3 1 d ; 
 
                   L i n e a r L a y o u t   s e c H 8 3 2 a ; 
 
                   V i e w   l i n e H 8 3 2 a ; 
 
                   T e x t V i e w   V l b l H 8 3 2 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 3 2 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 3 2 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 3 2 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 3 2 b ; 
 
                   V i e w   l i n e H 8 3 2 b ; 
 
                   T e x t V i e w   V l b l H 8 3 2 b ; 
 
                   E d i t T e x t   t x t H 8 3 2 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 3 2 c ; 
 
                   V i e w   l i n e H 8 3 2 c ; 
 
                   T e x t V i e w   V l b l H 8 3 2 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 3 2 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 3 2 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 3 2 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 3 2 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 3 2 d ; 
 
                   V i e w   l i n e H 8 3 2 d ; 
 
                   T e x t V i e w   V l b l H 8 3 2 d ; 
 
                   E d i t T e x t   t x t H 8 3 2 d ; 
 
                   L i n e a r L a y o u t   s e c L B H 8 4 ; 
 
                   L i n e a r L a y o u t   s e c H 8 4 1 a ; 
 
                   V i e w   l i n e H 8 4 1 a ; 
 
                   T e x t V i e w   V l b l H 8 4 1 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 4 1 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 4 1 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 4 1 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 4 1 b ; 
 
                   V i e w   l i n e H 8 4 1 b ; 
 
                   T e x t V i e w   V l b l H 8 4 1 b ; 
 
                   E d i t T e x t   t x t H 8 4 1 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 4 1 c ; 
 
                   V i e w   l i n e H 8 4 1 c ; 
 
                   T e x t V i e w   V l b l H 8 4 1 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 4 1 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 4 1 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 4 1 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 4 1 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 4 1 d ; 
 
                   V i e w   l i n e H 8 4 1 d ; 
 
                   T e x t V i e w   V l b l H 8 4 1 d ; 
 
                   E d i t T e x t   t x t H 8 4 1 d ; 
 
                   L i n e a r L a y o u t   s e c H 8 4 2 a ; 
 
                   V i e w   l i n e H 8 4 2 a ; 
 
                   T e x t V i e w   V l b l H 8 4 2 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 4 2 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 4 2 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 4 2 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 4 2 b ; 
 
                   V i e w   l i n e H 8 4 2 b ; 
 
                   T e x t V i e w   V l b l H 8 4 2 b ; 
 
                   E d i t T e x t   t x t H 8 4 2 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 4 2 c ; 
 
                   V i e w   l i n e H 8 4 2 c ; 
 
                   T e x t V i e w   V l b l H 8 4 2 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 4 2 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 4 2 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 4 2 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 4 2 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 4 2 d ; 
 
                   V i e w   l i n e H 8 4 2 d ; 
 
                   T e x t V i e w   V l b l H 8 4 2 d ; 
 
                   E d i t T e x t   t x t H 8 4 2 d ; 
 
                   L i n e a r L a y o u t   s e c L B H 8 5 ; 
 
                   L i n e a r L a y o u t   s e c H 8 5 1 a ; 
 
                   V i e w   l i n e H 8 5 1 a ; 
 
                   T e x t V i e w   V l b l H 8 5 1 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 5 1 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 5 1 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 5 1 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 5 1 b ; 
 
                   V i e w   l i n e H 8 5 1 b ; 
 
                   T e x t V i e w   V l b l H 8 5 1 b ; 
 
                   E d i t T e x t   t x t H 8 5 1 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 5 1 c ; 
 
                   V i e w   l i n e H 8 5 1 c ; 
 
                   T e x t V i e w   V l b l H 8 5 1 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 5 1 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 5 1 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 5 1 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 5 1 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 5 1 d ; 
 
                   V i e w   l i n e H 8 5 1 d ; 
 
                   T e x t V i e w   V l b l H 8 5 1 d ; 
 
                   E d i t T e x t   t x t H 8 5 1 d ; 
 
                   L i n e a r L a y o u t   s e c L B H 8 6 ; 
 
                   L i n e a r L a y o u t   s e c H 8 6 1 a ; 
 
                   V i e w   l i n e H 8 6 1 a ; 
 
                   T e x t V i e w   V l b l H 8 6 1 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 6 1 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 6 1 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 6 1 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 6 1 b ; 
 
                   V i e w   l i n e H 8 6 1 b ; 
 
                   T e x t V i e w   V l b l H 8 6 1 b ; 
 
                   E d i t T e x t   t x t H 8 6 1 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 6 1 c ; 
 
                   V i e w   l i n e H 8 6 1 c ; 
 
                   T e x t V i e w   V l b l H 8 6 1 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 6 1 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 6 1 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 6 1 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 6 1 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 6 1 d ; 
 
                   V i e w   l i n e H 8 6 1 d ; 
 
                   T e x t V i e w   V l b l H 8 6 1 d ; 
 
                   E d i t T e x t   t x t H 8 6 1 d ; 
 
                   L i n e a r L a y o u t   s e c H 8 6 2 a ; 
 
                   V i e w   l i n e H 8 6 2 a ; 
 
                   T e x t V i e w   V l b l H 8 6 2 a ; 
 
                   R a d i o G r o u p   r d o g r p H 8 6 2 a ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 6 2 a 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 6 2 a 2 ; 
 
                   L i n e a r L a y o u t   s e c H 8 6 2 b ; 
 
                   V i e w   l i n e H 8 6 2 b ; 
 
                   T e x t V i e w   V l b l H 8 6 2 b ; 
 
                   E d i t T e x t   t x t H 8 6 2 b ; 
 
                   L i n e a r L a y o u t   s e c H 8 6 2 c ; 
 
                   V i e w   l i n e H 8 6 2 c ; 
 
                   T e x t V i e w   V l b l H 8 6 2 c ; 
 
                   R a d i o G r o u p   r d o g r p H 8 6 2 c ; 
 
                   
 
                   R a d i o B u t t o n   r d o H 8 6 2 c 1 ; 
 
                   R a d i o B u t t o n   r d o H 8 6 2 c 2 ; 
 
                   R a d i o B u t t o n   r d o H 8 6 2 c 3 ; 
 
                   L i n e a r L a y o u t   s e c H 8 6 2 d ; 
 
                   V i e w   l i n e H 8 6 2 d ; 
 
                   T e x t V i e w   V l b l H 8 6 2 d ; 
 
                   E d i t T e x t   t x t H 8 6 2 d ; 
 
 
 
   S t r i n g   S t a r t T i m e ; 
 
   B u n d l e   I D b u n d l e ; 
 
         s t a t i c   S t r i n g   R N D   =   " " ; 
 
         s t a t i c   S t r i n g   S U C H A N A I D   =   " " ; 
 
 
 
   p u b l i c   v o i d   o n C r e a t e ( B u n d l e   s a v e d I n s t a n c e S t a t e )   { 
 
                   s u p e r . o n C r e a t e ( s a v e d I n s t a n c e S t a t e ) ; 
 
       t r y 
 
           { 
 
                   s e t C o n t e n t V i e w ( R . l a y o u t . c o s t 1 ) ; 
 
                   C   =   n e w   C o n n e c t i o n ( t h i s ) ; 
 
                   g   =   G l o b a l . g e t I n s t a n c e ( ) ; 
 
                   S t a r t T i m e   =   g . C u r r e n t T i m e 2 4 ( ) ; 
 
                   I D b u n d l e   =   g e t I n t e n t ( ) . g e t E x t r a s ( ) ; 
 
                               R N D   =   I D b u n d l e . g e t S t r i n g ( " R n d " ) ; 
 
                               S U C H A N A I D   =   I D b u n d l e . g e t S t r i n g ( " S u c h a n a I D " ) ; 
 
 
 
                   T a b l e N a m e   =   " C o s t 1 " ; 
 
 
 
                   / / t u r n G P S O n ( ) ; 
 
 
 
                   / / G P S   L o c a t i o n 
 
                   / / F i n d L o c a t i o n ( ) ; 
 
                   / /   D o u b l e . t o S t r i n g ( c u r r e n t L a t i t u d e ) ; 
 
                   / /   D o u b l e . t o S t r i n g ( c u r r e n t L o n g i t u d e ) ; 
 
                   l b l H e a d i n g   =   ( T e x t V i e w ) f i n d V i e w B y I d ( R . i d . l b l H e a d i n g ) ; 
 
 
 
                   I m a g e B u t t o n   c m d B a c k   =   ( I m a g e B u t t o n )   f i n d V i e w B y I d ( R . i d . c m d B a c k ) ; 
 
                   c m d B a c k . s e t O n C l i c k L i s t e n e r ( n e w   V i e w . O n C l i c k L i s t e n e r ( )   { 
 
                           p u b l i c   v o i d   o n C l i c k ( V i e w   v )   { 
 
                                   A l e r t D i a l o g . B u i l d e r   a d b   =   n e w   A l e r t D i a l o g . B u i l d e r ( C o s t 1 . t h i s ) ; 
 
                                   a d b . s e t T i t l e ( " C l o s e " ) ; 
 
                                   a d b . s e t M e s s a g e ( " D o   y o u   w a n t   t o   c l o s e   t h i s   f o r m [ Y e s / N o ] ? " ) ; 
 
                                   a d b . s e t N e g a t i v e B u t t o n ( " N o " ,   n u l l ) ; 
 
                                   a d b . s e t P o s i t i v e B u t t o n ( " Y e s " ,   n e w   A l e r t D i a l o g . O n C l i c k L i s t e n e r ( )   { 
 
                                           p u b l i c   v o i d   o n C l i c k ( D i a l o g I n t e r f a c e   d i a l o g ,   i n t   w h i c h )   { 
 
                                                   f i n i s h ( ) ; 
 
                                           } } ) ; 
 
                                   a d b . s h o w ( ) ; 
 
                           } } ) ; 
 
 
 
 
 
                   s e c R n d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c R n d ) ; 
 
                   l i n e R n d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e R n d ) ; 
 
                   V l b l R n d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l R n d ) ; 
 
                   t x t R n d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t R n d ) ; 
 
                   s e c S u c h a n a I D = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c S u c h a n a I D ) ; 
 
                   l i n e S u c h a n a I D = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e S u c h a n a I D ) ; 
 
                   V l b l S u c h a n a I D = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l S u c h a n a I D ) ; 
 
                   t x t S u c h a n a I D = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t S u c h a n a I D ) ; 
 
                   s e c M S l N o = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c M S l N o ) ; 
 
                   l i n e M S l N o = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e M S l N o ) ; 
 
                   V l b l M S l N o = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l M S l N o ) ; 
 
                   t x t M S l N o = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t M S l N o ) ; 
 
                   s e c L B H 8 = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c L B H 8 ) ; 
 
                   s e c H 8 1 1 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 1 a ) ; 
 
                   l i n e H 8 1 1 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 1 a ) ; 
 
                   V l b l H 8 1 1 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 1 a ) ; 
 
                   r d o g r p H 8 1 1 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 1 a ) ; 
 
                   
 
                   r d o H 8 1 1 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 1 a 1 ) ; 
 
                   r d o H 8 1 1 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 1 a 2 ) ; 
 
                   r d o g r p H 8 1 1 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 1 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 1 1 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 1 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 1 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 1 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 1 1 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 1 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 1 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 1 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 1 1 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 1 b ) ; 
 
                   l i n e H 8 1 1 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 1 b ) ; 
 
                   V l b l H 8 1 1 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 1 b ) ; 
 
                   t x t H 8 1 1 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 1 b ) ; 
 
                   s e c H 8 1 1 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 1 c ) ; 
 
                   l i n e H 8 1 1 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 1 c ) ; 
 
                   V l b l H 8 1 1 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 1 c ) ; 
 
                   r d o g r p H 8 1 1 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 1 c ) ; 
 
                   
 
                   r d o H 8 1 1 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 1 c 1 ) ; 
 
                   r d o H 8 1 1 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 1 c 2 ) ; 
 
                   r d o H 8 1 1 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 1 c 3 ) ; 
 
                   s e c H 8 1 1 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 1 d ) ; 
 
                   l i n e H 8 1 1 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 1 d ) ; 
 
                   V l b l H 8 1 1 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 1 d ) ; 
 
                   t x t H 8 1 1 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 1 d ) ; 
 
                   s e c H 8 1 2 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 2 a ) ; 
 
                   l i n e H 8 1 2 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 2 a ) ; 
 
                   V l b l H 8 1 2 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 2 a ) ; 
 
                   r d o g r p H 8 1 2 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 2 a ) ; 
 
                   
 
                   r d o H 8 1 2 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 2 a 1 ) ; 
 
                   r d o H 8 1 2 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 2 a 2 ) ; 
 
                   r d o g r p H 8 1 2 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 2 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 2 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 1 2 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 1 2 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 2 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 2 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 1 2 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 2 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 1 2 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 1 2 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 2 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 2 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 1 2 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 2 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 2 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 2 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 2 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 2 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 1 2 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 2 b ) ; 
 
                   l i n e H 8 1 2 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 2 b ) ; 
 
                   V l b l H 8 1 2 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 2 b ) ; 
 
                   t x t H 8 1 2 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 2 b ) ; 
 
                   s e c H 8 1 2 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 2 c ) ; 
 
                   l i n e H 8 1 2 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 2 c ) ; 
 
                   V l b l H 8 1 2 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 2 c ) ; 
 
                   r d o g r p H 8 1 2 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 2 c ) ; 
 
                   
 
                   r d o H 8 1 2 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 2 c 1 ) ; 
 
                   r d o H 8 1 2 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 2 c 2 ) ; 
 
                   r d o H 8 1 2 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 2 c 3 ) ; 
 
                   s e c H 8 1 2 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 2 d ) ; 
 
                   l i n e H 8 1 2 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 2 d ) ; 
 
                   V l b l H 8 1 2 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 2 d ) ; 
 
                   t x t H 8 1 2 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 2 d ) ; 
 
                   s e c H 8 1 3 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 3 a ) ; 
 
                   l i n e H 8 1 3 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 3 a ) ; 
 
                   V l b l H 8 1 3 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 3 a ) ; 
 
                   r d o g r p H 8 1 3 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 3 a ) ; 
 
                   
 
                   r d o H 8 1 3 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 3 a 1 ) ; 
 
                   r d o H 8 1 3 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 3 a 2 ) ; 
 
                   r d o g r p H 8 1 3 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 3 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 3 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 3 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 1 3 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 1 3 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 3 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 3 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 1 3 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 3 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 1 3 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 1 3 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 3 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 3 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 1 3 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 3 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 3 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 3 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 3 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 3 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 1 3 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 3 b ) ; 
 
                   l i n e H 8 1 3 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 3 b ) ; 
 
                   V l b l H 8 1 3 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 3 b ) ; 
 
                   t x t H 8 1 3 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 3 b ) ; 
 
                   s e c H 8 1 3 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 3 c ) ; 
 
                   l i n e H 8 1 3 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 3 c ) ; 
 
                   V l b l H 8 1 3 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 3 c ) ; 
 
                   r d o g r p H 8 1 3 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 3 c ) ; 
 
                   
 
                   r d o H 8 1 3 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 3 c 1 ) ; 
 
                   r d o H 8 1 3 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 3 c 2 ) ; 
 
                   r d o H 8 1 3 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 3 c 3 ) ; 
 
                   s e c H 8 1 3 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 3 d ) ; 
 
                   l i n e H 8 1 3 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 3 d ) ; 
 
                   V l b l H 8 1 3 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 3 d ) ; 
 
                   t x t H 8 1 3 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 3 d ) ; 
 
                   s e c H 8 1 4 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 4 a ) ; 
 
                   l i n e H 8 1 4 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 4 a ) ; 
 
                   V l b l H 8 1 4 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 4 a ) ; 
 
                   r d o g r p H 8 1 4 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 4 a ) ; 
 
                   
 
                   r d o H 8 1 4 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 4 a 1 ) ; 
 
                   r d o H 8 1 4 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 4 a 2 ) ; 
 
                   r d o g r p H 8 1 4 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 4 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 4 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 4 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 1 4 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 1 4 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 4 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 4 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 1 4 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 4 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 1 4 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 1 4 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 4 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 4 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 1 4 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 4 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 4 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 4 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 4 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 4 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 1 4 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 4 b ) ; 
 
                   l i n e H 8 1 4 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 4 b ) ; 
 
                   V l b l H 8 1 4 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 4 b ) ; 
 
                   t x t H 8 1 4 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 4 b ) ; 
 
                   s e c H 8 1 4 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 4 c ) ; 
 
                   l i n e H 8 1 4 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 4 c ) ; 
 
                   V l b l H 8 1 4 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 4 c ) ; 
 
                   r d o g r p H 8 1 4 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 4 c ) ; 
 
                   
 
                   r d o H 8 1 4 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 4 c 1 ) ; 
 
                   r d o H 8 1 4 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 4 c 2 ) ; 
 
                   r d o H 8 1 4 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 4 c 3 ) ; 
 
                   s e c H 8 1 4 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 4 d ) ; 
 
                   l i n e H 8 1 4 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 4 d ) ; 
 
                   V l b l H 8 1 4 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 4 d ) ; 
 
                   t x t H 8 1 4 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 4 d ) ; 
 
                   s e c H 8 1 5 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 5 a ) ; 
 
                   l i n e H 8 1 5 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 5 a ) ; 
 
                   V l b l H 8 1 5 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 5 a ) ; 
 
                   r d o g r p H 8 1 5 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 5 a ) ; 
 
                   
 
                   r d o H 8 1 5 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 5 a 1 ) ; 
 
                   r d o H 8 1 5 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 5 a 2 ) ; 
 
                   r d o g r p H 8 1 5 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 5 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 5 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 5 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 1 5 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 1 5 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 5 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 5 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 1 5 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 5 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 1 5 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 1 5 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 5 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 5 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 1 5 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 5 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 5 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 5 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 5 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 5 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 1 5 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 5 b ) ; 
 
                   l i n e H 8 1 5 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 5 b ) ; 
 
                   V l b l H 8 1 5 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 5 b ) ; 
 
                   t x t H 8 1 5 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 5 b ) ; 
 
                   s e c H 8 1 5 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 5 c ) ; 
 
                   l i n e H 8 1 5 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 5 c ) ; 
 
                   V l b l H 8 1 5 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 5 c ) ; 
 
                   r d o g r p H 8 1 5 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 5 c ) ; 
 
                   
 
                   r d o H 8 1 5 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 5 c 1 ) ; 
 
                   r d o H 8 1 5 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 5 c 2 ) ; 
 
                   r d o H 8 1 5 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 5 c 3 ) ; 
 
                   s e c H 8 1 5 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 5 d ) ; 
 
                   l i n e H 8 1 5 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 5 d ) ; 
 
                   V l b l H 8 1 5 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 5 d ) ; 
 
                   t x t H 8 1 5 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 5 d ) ; 
 
                   s e c H 8 1 6 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 6 a ) ; 
 
                   l i n e H 8 1 6 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 6 a ) ; 
 
                   V l b l H 8 1 6 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 6 a ) ; 
 
                   r d o g r p H 8 1 6 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 6 a ) ; 
 
                   
 
                   r d o H 8 1 6 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 6 a 1 ) ; 
 
                   r d o H 8 1 6 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 6 a 2 ) ; 
 
                   r d o g r p H 8 1 6 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 6 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 6 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 6 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 1 6 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 1 6 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 6 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 6 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 1 6 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 6 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 1 6 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 1 6 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 1 6 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 1 6 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 1 6 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 6 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 6 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 6 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 1 6 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 1 6 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 1 6 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 6 b ) ; 
 
                   l i n e H 8 1 6 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 6 b ) ; 
 
                   V l b l H 8 1 6 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 6 b ) ; 
 
                   t x t H 8 1 6 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 6 b ) ; 
 
                   s e c H 8 1 6 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 6 c ) ; 
 
                   l i n e H 8 1 6 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 6 c ) ; 
 
                   V l b l H 8 1 6 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 6 c ) ; 
 
                   r d o g r p H 8 1 6 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 1 6 c ) ; 
 
                   
 
                   r d o H 8 1 6 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 6 c 1 ) ; 
 
                   r d o H 8 1 6 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 6 c 2 ) ; 
 
                   r d o H 8 1 6 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 1 6 c 3 ) ; 
 
                   s e c H 8 1 6 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 1 6 d ) ; 
 
                   l i n e H 8 1 6 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 1 6 d ) ; 
 
                   V l b l H 8 1 6 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 1 6 d ) ; 
 
                   t x t H 8 1 6 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 1 6 d ) ; 
 
                   s e c L B H 8 2 = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c L B H 8 2 ) ; 
 
                   s e c H 8 2 1 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 2 1 a ) ; 
 
                   l i n e H 8 2 1 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 2 1 a ) ; 
 
                   V l b l H 8 2 1 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 2 1 a ) ; 
 
                   r d o g r p H 8 2 1 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 2 1 a ) ; 
 
                   
 
                   r d o H 8 2 1 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 2 1 a 1 ) ; 
 
                   r d o H 8 2 1 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 2 1 a 2 ) ; 
 
                   r d o g r p H 8 2 1 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 2 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 2 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 2 1 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 2 1 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 2 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 2 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 2 1 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 2 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 2 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 2 1 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 2 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 2 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 2 1 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 2 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 2 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 2 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 2 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 2 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 2 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 2 1 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 2 1 b ) ; 
 
                   l i n e H 8 2 1 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 2 1 b ) ; 
 
                   V l b l H 8 2 1 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 2 1 b ) ; 
 
                   t x t H 8 2 1 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 2 1 b ) ; 
 
                   s e c H 8 2 1 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 2 1 c ) ; 
 
                   l i n e H 8 2 1 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 2 1 c ) ; 
 
                   V l b l H 8 2 1 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 2 1 c ) ; 
 
                   r d o g r p H 8 2 1 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 2 1 c ) ; 
 
                   
 
                   r d o H 8 2 1 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 2 1 c 1 ) ; 
 
                   r d o H 8 2 1 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 2 1 c 2 ) ; 
 
                   r d o H 8 2 1 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 2 1 c 3 ) ; 
 
                   s e c H 8 2 1 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 2 1 d ) ; 
 
                   l i n e H 8 2 1 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 2 1 d ) ; 
 
                   V l b l H 8 2 1 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 2 1 d ) ; 
 
                   t x t H 8 2 1 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 2 1 d ) ; 
 
                   s e c L B H 8 3 = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c L B H 8 3 ) ; 
 
                   s e c H 8 3 1 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 3 1 a ) ; 
 
                   l i n e H 8 3 1 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 3 1 a ) ; 
 
                   V l b l H 8 3 1 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 3 1 a ) ; 
 
                   r d o g r p H 8 3 1 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 3 1 a ) ; 
 
                   
 
                   r d o H 8 3 1 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 1 a 1 ) ; 
 
                   r d o H 8 3 1 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 1 a 2 ) ; 
 
                   r d o g r p H 8 3 1 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 3 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 3 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 1 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 3 1 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 3 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 3 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 3 1 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 3 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 3 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 3 1 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 3 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 3 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 3 1 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 3 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 3 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 3 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 3 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 3 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 3 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 3 1 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 3 1 b ) ; 
 
                   l i n e H 8 3 1 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 3 1 b ) ; 
 
                   V l b l H 8 3 1 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 3 1 b ) ; 
 
                   t x t H 8 3 1 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 3 1 b ) ; 
 
                   s e c H 8 3 1 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 3 1 c ) ; 
 
                   l i n e H 8 3 1 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 3 1 c ) ; 
 
                   V l b l H 8 3 1 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 3 1 c ) ; 
 
                   r d o g r p H 8 3 1 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 3 1 c ) ; 
 
                   
 
                   r d o H 8 3 1 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 1 c 1 ) ; 
 
                   r d o H 8 3 1 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 1 c 2 ) ; 
 
                   r d o H 8 3 1 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 1 c 3 ) ; 
 
                   s e c H 8 3 1 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 3 1 d ) ; 
 
                   l i n e H 8 3 1 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 3 1 d ) ; 
 
                   V l b l H 8 3 1 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 3 1 d ) ; 
 
                   t x t H 8 3 1 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 3 1 d ) ; 
 
                   s e c H 8 3 2 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 3 2 a ) ; 
 
                   l i n e H 8 3 2 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 3 2 a ) ; 
 
                   V l b l H 8 3 2 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 3 2 a ) ; 
 
                   r d o g r p H 8 3 2 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 3 2 a ) ; 
 
                   
 
                   r d o H 8 3 2 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 2 a 1 ) ; 
 
                   r d o H 8 3 2 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 2 a 2 ) ; 
 
                   r d o g r p H 8 3 2 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 3 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 3 2 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 2 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 3 2 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 3 2 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 3 2 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 3 2 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 3 2 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 3 2 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 3 2 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 3 2 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 3 2 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 3 2 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 3 2 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 3 2 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 3 2 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 3 2 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 3 2 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 3 2 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 3 2 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 3 2 b ) ; 
 
                   l i n e H 8 3 2 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 3 2 b ) ; 
 
                   V l b l H 8 3 2 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 3 2 b ) ; 
 
                   t x t H 8 3 2 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 3 2 b ) ; 
 
                   s e c H 8 3 2 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 3 2 c ) ; 
 
                   l i n e H 8 3 2 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 3 2 c ) ; 
 
                   V l b l H 8 3 2 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 3 2 c ) ; 
 
                   r d o g r p H 8 3 2 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 3 2 c ) ; 
 
                   
 
                   r d o H 8 3 2 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 2 c 1 ) ; 
 
                   r d o H 8 3 2 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 2 c 2 ) ; 
 
                   r d o H 8 3 2 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 3 2 c 3 ) ; 
 
                   s e c H 8 3 2 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 3 2 d ) ; 
 
                   l i n e H 8 3 2 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 3 2 d ) ; 
 
                   V l b l H 8 3 2 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 3 2 d ) ; 
 
                   t x t H 8 3 2 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 3 2 d ) ; 
 
                   s e c L B H 8 4 = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c L B H 8 4 ) ; 
 
                   s e c H 8 4 1 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 4 1 a ) ; 
 
                   l i n e H 8 4 1 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 4 1 a ) ; 
 
                   V l b l H 8 4 1 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 4 1 a ) ; 
 
                   r d o g r p H 8 4 1 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 4 1 a ) ; 
 
                   
 
                   r d o H 8 4 1 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 1 a 1 ) ; 
 
                   r d o H 8 4 1 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 1 a 2 ) ; 
 
                   r d o g r p H 8 4 1 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 4 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 4 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 1 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 4 1 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 4 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 4 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 4 1 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 4 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 4 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 4 1 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 4 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 4 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 4 1 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 4 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 4 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 4 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 4 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 4 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 4 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 4 1 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 4 1 b ) ; 
 
                   l i n e H 8 4 1 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 4 1 b ) ; 
 
                   V l b l H 8 4 1 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 4 1 b ) ; 
 
                   t x t H 8 4 1 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 4 1 b ) ; 
 
                   s e c H 8 4 1 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 4 1 c ) ; 
 
                   l i n e H 8 4 1 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 4 1 c ) ; 
 
                   V l b l H 8 4 1 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 4 1 c ) ; 
 
                   r d o g r p H 8 4 1 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 4 1 c ) ; 
 
                   
 
                   r d o H 8 4 1 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 1 c 1 ) ; 
 
                   r d o H 8 4 1 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 1 c 2 ) ; 
 
                   r d o H 8 4 1 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 1 c 3 ) ; 
 
                   s e c H 8 4 1 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 4 1 d ) ; 
 
                   l i n e H 8 4 1 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 4 1 d ) ; 
 
                   V l b l H 8 4 1 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 4 1 d ) ; 
 
                   t x t H 8 4 1 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 4 1 d ) ; 
 
                   s e c H 8 4 2 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 4 2 a ) ; 
 
                   l i n e H 8 4 2 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 4 2 a ) ; 
 
                   V l b l H 8 4 2 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 4 2 a ) ; 
 
                   r d o g r p H 8 4 2 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 4 2 a ) ; 
 
                   
 
                   r d o H 8 4 2 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 2 a 1 ) ; 
 
                   r d o H 8 4 2 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 2 a 2 ) ; 
 
                   r d o g r p H 8 4 2 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 4 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 4 2 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 2 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 4 2 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 4 2 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 4 2 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 4 2 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 4 2 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 4 2 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 4 2 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 4 2 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 4 2 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 4 2 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 4 2 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 4 2 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 4 2 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 4 2 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 4 2 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 4 2 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 4 2 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 4 2 b ) ; 
 
                   l i n e H 8 4 2 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 4 2 b ) ; 
 
                   V l b l H 8 4 2 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 4 2 b ) ; 
 
                   t x t H 8 4 2 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 4 2 b ) ; 
 
                   s e c H 8 4 2 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 4 2 c ) ; 
 
                   l i n e H 8 4 2 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 4 2 c ) ; 
 
                   V l b l H 8 4 2 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 4 2 c ) ; 
 
                   r d o g r p H 8 4 2 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 4 2 c ) ; 
 
                   
 
                   r d o H 8 4 2 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 2 c 1 ) ; 
 
                   r d o H 8 4 2 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 2 c 2 ) ; 
 
                   r d o H 8 4 2 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 4 2 c 3 ) ; 
 
                   s e c H 8 4 2 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 4 2 d ) ; 
 
                   l i n e H 8 4 2 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 4 2 d ) ; 
 
                   V l b l H 8 4 2 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 4 2 d ) ; 
 
                   t x t H 8 4 2 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 4 2 d ) ; 
 
                   s e c L B H 8 5 = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c L B H 8 5 ) ; 
 
                   s e c H 8 5 1 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 5 1 a ) ; 
 
                   l i n e H 8 5 1 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 5 1 a ) ; 
 
                   V l b l H 8 5 1 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 5 1 a ) ; 
 
                   r d o g r p H 8 5 1 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 5 1 a ) ; 
 
                   
 
                   r d o H 8 5 1 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 5 1 a 1 ) ; 
 
                   r d o H 8 5 1 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 5 1 a 2 ) ; 
 
                   r d o g r p H 8 5 1 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 5 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 5 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 5 1 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 5 1 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 5 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 5 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 5 1 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 5 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 5 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 5 1 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 5 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 5 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 5 1 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 5 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 5 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 5 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 5 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 5 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 5 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 5 1 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 5 1 b ) ; 
 
                   l i n e H 8 5 1 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 5 1 b ) ; 
 
                   V l b l H 8 5 1 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 5 1 b ) ; 
 
                   t x t H 8 5 1 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 5 1 b ) ; 
 
                   s e c H 8 5 1 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 5 1 c ) ; 
 
                   l i n e H 8 5 1 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 5 1 c ) ; 
 
                   V l b l H 8 5 1 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 5 1 c ) ; 
 
                   r d o g r p H 8 5 1 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 5 1 c ) ; 
 
                   
 
                   r d o H 8 5 1 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 5 1 c 1 ) ; 
 
                   r d o H 8 5 1 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 5 1 c 2 ) ; 
 
                   r d o H 8 5 1 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 5 1 c 3 ) ; 
 
                   s e c H 8 5 1 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 5 1 d ) ; 
 
                   l i n e H 8 5 1 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 5 1 d ) ; 
 
                   V l b l H 8 5 1 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 5 1 d ) ; 
 
                   t x t H 8 5 1 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 5 1 d ) ; 
 
                   s e c L B H 8 6 = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c L B H 8 6 ) ; 
 
                   s e c H 8 6 1 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 6 1 a ) ; 
 
                   l i n e H 8 6 1 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 6 1 a ) ; 
 
                   V l b l H 8 6 1 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 6 1 a ) ; 
 
                   r d o g r p H 8 6 1 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 6 1 a ) ; 
 
                   
 
                   r d o H 8 6 1 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 1 a 1 ) ; 
 
                   r d o H 8 6 1 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 1 a 2 ) ; 
 
                   r d o g r p H 8 6 1 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 6 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 6 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 1 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 6 1 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 6 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 6 1 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 6 1 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 6 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 6 1 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 6 1 c . c l e a r C h e c k ( ) ; 
 
                                         s e c H 8 6 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 6 1 d . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 6 1 d . s e t T e x t ( " " ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 6 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 6 1 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 6 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 6 1 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 6 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 6 1 d . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 6 1 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 6 1 b ) ; 
 
                   l i n e H 8 6 1 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 6 1 b ) ; 
 
                   V l b l H 8 6 1 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 6 1 b ) ; 
 
                   t x t H 8 6 1 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 6 1 b ) ; 
 
                   s e c H 8 6 1 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 6 1 c ) ; 
 
                   l i n e H 8 6 1 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 6 1 c ) ; 
 
                   V l b l H 8 6 1 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 6 1 c ) ; 
 
                   r d o g r p H 8 6 1 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 6 1 c ) ; 
 
                   
 
                   r d o H 8 6 1 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 1 c 1 ) ; 
 
                   r d o H 8 6 1 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 1 c 2 ) ; 
 
                   r d o H 8 6 1 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 1 c 3 ) ; 
 
                   s e c H 8 6 1 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 6 1 d ) ; 
 
                   l i n e H 8 6 1 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 6 1 d ) ; 
 
                   V l b l H 8 6 1 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 6 1 d ) ; 
 
                   t x t H 8 6 1 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 6 1 d ) ; 
 
                   s e c H 8 6 2 a = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 6 2 a ) ; 
 
                   l i n e H 8 6 2 a = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 6 2 a ) ; 
 
                   V l b l H 8 6 2 a   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 6 2 a ) ; 
 
                   r d o g r p H 8 6 2 a   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 6 2 a ) ; 
 
                   
 
                   r d o H 8 6 2 a 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 2 a 1 ) ; 
 
                   r d o H 8 6 2 a 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 2 a 2 ) ; 
 
                   r d o g r p H 8 6 2 a . s e t O n C h e c k e d C h a n g e L i s t e n e r ( n e w   R a d i o G r o u p . O n C h e c k e d C h a n g e L i s t e n e r ( ) { 
 
                   @ O v e r r i d e 
 
                   p u b l i c   v o i d   o n C h e c k e d C h a n g e d ( R a d i o G r o u p   r a d i o G r o u p , i n t   r a d i o B u t t o n I D )   { 
 
                           S t r i n g   r b D a t a   =   " " ; 
 
                           R a d i o B u t t o n   r b ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 6 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 6 2 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                           { 
 
                               r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 2 a . g e t C h i l d A t ( i ) ; 
 
                               i f   ( r b . i s C h e c k e d ( ) )   r b D a t a   =   d _ r d o g r p H 8 6 2 a [ i ] ; 
 
                           } 
 
 
 
                           i f ( r b D a t a . e q u a l s I g n o r e C a s e ( " 0 " ) ) 
 
                           { 
 
                                         s e c H 8 6 2 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 6 2 b . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         t x t H 8 6 2 b . s e t T e x t ( " " ) ; 
 
                                         s e c H 8 6 2 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         l i n e H 8 6 2 c . s e t V i s i b i l i t y ( V i e w . G O N E ) ; 
 
                                         r d o g r p H 8 6 2 c . c l e a r C h e c k ( ) ; 
 
                           } 
 
                           e l s e 
 
                           { 
 
                                         s e c H 8 6 2 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 6 2 b . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         s e c H 8 6 2 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                                         l i n e H 8 6 2 c . s e t V i s i b i l i t y ( V i e w . V I S I B L E ) ; 
 
                           } 
 
                         } 
 
                   p u b l i c   v o i d   o n N o t h i n g S e l e c t e d ( A d a p t e r V i e w < ? >   a d a p t e r V i e w )   { 
 
                           r e t u r n ; 
 
                         }   
 
                   } ) ;   
 
                   s e c H 8 6 2 b = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 6 2 b ) ; 
 
                   l i n e H 8 6 2 b = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 6 2 b ) ; 
 
                   V l b l H 8 6 2 b = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 6 2 b ) ; 
 
                   t x t H 8 6 2 b = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 6 2 b ) ; 
 
                   s e c H 8 6 2 c = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 6 2 c ) ; 
 
                   l i n e H 8 6 2 c = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 6 2 c ) ; 
 
                   V l b l H 8 6 2 c   =   ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 6 2 c ) ; 
 
                   r d o g r p H 8 6 2 c   =   ( R a d i o G r o u p )   f i n d V i e w B y I d ( R . i d . r d o g r p H 8 6 2 c ) ; 
 
                   
 
                   r d o H 8 6 2 c 1   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 2 c 1 ) ; 
 
                   r d o H 8 6 2 c 2   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 2 c 2 ) ; 
 
                   r d o H 8 6 2 c 3   =   ( R a d i o B u t t o n )   f i n d V i e w B y I d ( R . i d . r d o H 8 6 2 c 3 ) ; 
 
                   s e c H 8 6 2 d = ( L i n e a r L a y o u t ) f i n d V i e w B y I d ( R . i d . s e c H 8 6 2 d ) ; 
 
                   l i n e H 8 6 2 d = ( V i e w ) f i n d V i e w B y I d ( R . i d . l i n e H 8 6 2 d ) ; 
 
                   V l b l H 8 6 2 d = ( T e x t V i e w )   f i n d V i e w B y I d ( R . i d . V l b l H 8 6 2 d ) ; 
 
                   t x t H 8 6 2 d = ( E d i t T e x t )   f i n d V i e w B y I d ( R . i d . t x t H 8 6 2 d ) ; 
 
 
 
 
 
 
 
 
 
 
 
 
 
                 B u t t o n   c m d S a v e   =   ( B u t t o n )   f i n d V i e w B y I d ( R . i d . c m d S a v e ) ; 
 
                 c m d S a v e . s e t O n C l i c k L i s t e n e r ( n e w   V i e w . O n C l i c k L i s t e n e r ( )   { 
 
                 p u b l i c   v o i d   o n C l i c k ( V i e w   v )   {   
 
                         D a t a S a v e ( ) ; 
 
                 } } ) ; 
 
           } 
 
           c a t c h ( E x c e p t i o n     e ) 
 
           { 
 
                   C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   e . g e t M e s s a g e ( ) ) ; 
 
                   r e t u r n ; 
 
           } 
 
   } 
 
 
 
   p r i v a t e   v o i d   D a t a S a v e ( ) 
 
   { 
 
       t r y 
 
           { 
 
   
 
                   S t r i n g   D V = " " ; 
 
 
 
                   i f ( t x t R n d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c R n d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	  �	�	�	�	�	�	�	. " ) ; 
 
                           t x t R n d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t R n d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t R n d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t R n d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 5 "   :   t x t R n d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   5 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   5 ( �	�	�	�	�	�	  �	�	�	�	�	�	�	) . " ) ; 
 
                           t x t R n d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( t x t S u c h a n a I D . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c S u c h a n a I D . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	�	�	�	/ �	�	�	�	�	  �	�	�	�	. " ) ; 
 
                           t x t S u c h a n a I D . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( t x t M S l N o . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c M S l N o . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	�	�	  �	�	�	�	�	�	�	�	�	�	�	  �	�	�	�	  �	�	�	�	�	. " ) ; 
 
                           t x t M S l N o . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t M S l N o . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t M S l N o . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t M S l N o . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 5 "   :   t x t M S l N o . g e t T e x t ( ) . t o S t r i n g ( ) )   >   1 5 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   1 5 ( �	�	�	�	�	�	�	�	  �	�	�	�	�	�	�	�	�	�	�	  �	�	�	�	  �	�	�	�	�	) . " ) ; 
 
                           t x t M S l N o . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 1 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 1 a 2 . i s C h e c k e d ( )   &   s e c H 8 1 1 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 1 1 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 1 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 1 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 1 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 1 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 1 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 1 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 1 1 c 3 . i s C h e c k e d ( )   &   s e c H 8 1 1 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 1 1 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 1 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 1 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 1 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 1 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 2 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 2 a 2 . i s C h e c k e d ( )   &   s e c H 8 1 2 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	    �	�	�	�	�	  �	�	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 1 2 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 2 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 1 2 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 2 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 1 2 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 1 2 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 2 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 2 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 1 2 c 3 . i s C h e c k e d ( )   &   s e c H 8 1 2 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 1 2 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 2 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 1 2 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 2 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 1 2 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 1 2 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 3 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 3 a 2 . i s C h e c k e d ( )   &   s e c H 8 1 3 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  �	�	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 1 3 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 3 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 3 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 1 3 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 3 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 3 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 3 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 1 3 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 1 3 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 3 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 3 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 1 3 c 3 . i s C h e c k e d ( )   &   s e c H 8 1 3 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 1 3 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 3 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 3 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 1 3 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 3 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 3 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 3 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 1 3 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 1 3 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 4 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 4 a 2 . i s C h e c k e d ( )   &   s e c H 8 1 4 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	  �	�	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 1 4 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 4 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 4 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 1 4 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 4 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 4 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 4 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 1 4 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 1 4 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 4 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 4 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 1 4 c 3 . i s C h e c k e d ( )   &   s e c H 8 1 4 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 1 4 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 4 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 4 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 1 4 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 4 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 4 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 4 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 1 4 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 1 4 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 5 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 5 a 2 . i s C h e c k e d ( )   &   s e c H 8 1 5 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 1 5 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 5 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 5 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 1 5 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 5 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 5 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 5 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 1 5 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 1 5 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 5 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 5 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 1 5 c 3 . i s C h e c k e d ( )   &   s e c H 8 1 5 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 1 5 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 5 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 5 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 1 5 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 5 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 5 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 5 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 1 5 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 1 5 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 6 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 6 a 2 . i s C h e c k e d ( )   &   s e c H 8 1 6 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 1 6 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 6 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 6 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 1 6 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 6 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 6 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 6 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 1 6 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 1 6 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 1 6 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 1 6 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 1 6 c 3 . i s C h e c k e d ( )   &   s e c H 8 1 6 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 1 6 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 1 6 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 1 6 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 1 6 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 1 6 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 1 6 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 1 6 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 1 6 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 1 6 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 2 1 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 2 1 a 2 . i s C h e c k e d ( )   &   s e c H 8 2 1 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 2 1 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 2 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 2 1 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 2 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 2 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 2 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 2 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 2 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 2 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 2 1 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 2 1 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 2 1 c 3 . i s C h e c k e d ( )   &   s e c H 8 2 1 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 2 1 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 2 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 2 1 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 2 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 2 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 2 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 2 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 2 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 2 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 3 1 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 3 1 a 2 . i s C h e c k e d ( )   &   s e c H 8 3 1 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	�	  �	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 3 1 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 3 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 3 1 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 3 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 3 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 3 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 3 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 3 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 3 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 3 1 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 3 1 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 3 1 c 3 . i s C h e c k e d ( )   &   s e c H 8 3 1 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 3 1 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 3 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 3 1 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 3 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 3 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 3 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 3 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 3 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 3 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 3 2 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 3 2 a 2 . i s C h e c k e d ( )   &   s e c H 8 3 2 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  �	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 3 2 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 3 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 3 2 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 3 2 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 3 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 3 2 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 3 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 3 2 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 3 2 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 3 2 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 3 2 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 3 2 c 3 . i s C h e c k e d ( )   &   s e c H 8 3 2 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	) . " ) ; 
 
                             r d o H 8 3 2 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 3 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 3 2 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 3 2 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 3 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 3 2 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 3 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 3 2 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 3 2 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 4 1 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 4 1 a 2 . i s C h e c k e d ( )   &   s e c H 8 4 1 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 4 1 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 4 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 4 1 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 4 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 4 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 4 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 4 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 4 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 4 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 4 1 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 4 1 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 4 1 c 3 . i s C h e c k e d ( )   &   s e c H 8 4 1 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 4 1 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 4 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 4 1 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 4 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 4 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 4 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 4 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 4 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 4 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 4 2 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 4 2 a 2 . i s C h e c k e d ( )   &   s e c H 8 4 2 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 4 2 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 4 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 4 2 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 4 2 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 4 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 4 2 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 4 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 4 2 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 4 2 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 4 2 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 4 2 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 4 2 c 3 . i s C h e c k e d ( )   &   s e c H 8 4 2 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 4 2 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 4 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 4 2 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 4 2 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 4 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 4 2 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 4 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 4 2 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 4 2 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 5 1 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 5 1 a 2 . i s C h e c k e d ( )   &   s e c H 8 5 1 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 5 1 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 5 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 5 1 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 5 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 5 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 5 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 5 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 5 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 5 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 5 1 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 5 1 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 5 1 c 3 . i s C h e c k e d ( )   &   s e c H 8 5 1 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 5 1 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 5 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 5 1 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 5 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 5 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 5 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 5 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 5 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 5 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 6 1 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 6 1 a 2 . i s C h e c k e d ( )   &   s e c H 8 6 1 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 6 1 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 6 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 6 1 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 6 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 6 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 6 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 6 1 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 6 1 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 6 1 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 6 1 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 6 1 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 6 1 c 3 . i s C h e c k e d ( )   &   s e c H 8 6 1 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 6 1 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 6 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 6 1 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 6 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 6 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 6 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 6 1 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 6 1 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 6 1 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 6 2 a 1 . i s C h e c k e d ( )   &   ! r d o H 8 6 2 a 2 . i s C h e c k e d ( )   &   s e c H 8 6 2 a . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	�	�	�	  �	�	�	�	    �	�	�	�	�	�	) . " ) ; 
 
                             r d o H 8 6 2 a 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 6 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 6 2 b . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	�	( �	�	�	�	�	�	) . " ) ; 
 
                           t x t H 8 6 2 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 6 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 6 2 b . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 6 2 b . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 "   :   t x t H 8 6 2 b . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 ( �	�	�	�	�	�	( �	�	�	�	�	�	) ) . " ) ; 
 
                           t x t H 8 6 2 b . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   
 
                   e l s e   i f ( ! r d o H 8 6 2 c 1 . i s C h e c k e d ( )   &   ! r d o H 8 6 2 c 2 . i s C h e c k e d ( )   &   ! r d o H 8 6 2 c 3 . i s C h e c k e d ( )   &   s e c H 8 6 2 c . i s S h o w n ( ) ) 
 
                       { 
 
                             C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S e l e c t   a n y o n e   o p t i o n s   f r o m   ( �	�	�	�	�	  ) . " ) ; 
 
                             r d o H 8 6 2 c 1 . r e q u e s t F o c u s ( ) ; 
 
                             r e t u r n ; 
 
                       } 
 
                   e l s e   i f ( t x t H 8 6 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   &   s e c H 8 6 2 d . i s S h o w n ( ) ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " R e q u i r e d   f i e l d :   �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	. " ) ; 
 
                           t x t H 8 6 2 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
                   e l s e   i f ( I n t e g e r . v a l u e O f ( t x t H 8 6 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 1 "   :   t x t H 8 6 2 d . g e t T e x t ( ) . t o S t r i n g ( ) )   <   1   | |   I n t e g e r . v a l u e O f ( t x t H 8 6 2 d . g e t T e x t ( ) . t o S t r i n g ( ) . l e n g t h ( ) = = 0   ?   " 9 9 9 9 9 9 "   :   t x t H 8 6 2 d . g e t T e x t ( ) . t o S t r i n g ( ) )   >   9 9 9 9 9 9 ) 
 
                       { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " V a l u e   s h o u l d   b e   b e t w e e n   1   a n d   9 9 9 9 9 9 ( �	�	�	�	�	  �	�	�	�	�	�	�	  �	�	�	�	�	  �	�	) . " ) ; 
 
                           t x t H 8 6 2 d . r e q u e s t F o c u s ( ) ;   
 
                           r e t u r n ; 	 
 
                       } 
 
   
 
                   S t r i n g   S Q L   =   " " ; 
 
                   R a d i o B u t t o n   r b ; 
 
 
 
                   C o s t 1 _ D a t a M o d e l   o b j S a v e   =   n e w   C o s t 1 _ D a t a M o d e l ( ) ; 
 
                   o b j S a v e . s e t R n d ( t x t R n d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   o b j S a v e . s e t S u c h a n a I D ( t x t S u c h a n a I D . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   o b j S a v e . s e t M S l N o ( t x t M S l N o . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 1 1 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 1 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 1 a ( d _ r d o g r p H 8 1 1 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 1 b ( t x t H 8 1 1 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 1 1 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 1 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 1 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 1 c ( d _ r d o g r p H 8 1 1 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 1 d ( t x t H 8 1 1 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 1 2 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 2 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 2 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 2 a ( d _ r d o g r p H 8 1 2 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 2 b ( t x t H 8 1 2 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 2 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 1 2 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 2 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 2 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 2 c ( d _ r d o g r p H 8 1 2 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 2 d ( t x t H 8 1 2 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 3 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 1 3 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 3 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 3 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 3 a ( d _ r d o g r p H 8 1 3 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 3 b ( t x t H 8 1 3 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 3 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 1 3 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 3 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 3 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 3 c ( d _ r d o g r p H 8 1 3 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 3 d ( t x t H 8 1 3 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 4 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 1 4 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 4 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 4 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 4 a ( d _ r d o g r p H 8 1 4 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 4 b ( t x t H 8 1 4 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 4 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 1 4 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 4 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 4 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 4 c ( d _ r d o g r p H 8 1 4 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 4 d ( t x t H 8 1 4 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 5 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 1 5 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 5 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 5 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 5 a ( d _ r d o g r p H 8 1 5 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 5 b ( t x t H 8 1 5 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 5 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 1 5 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 5 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 5 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 5 c ( d _ r d o g r p H 8 1 5 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 5 d ( t x t H 8 1 5 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 6 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 1 6 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 6 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 6 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 6 a ( d _ r d o g r p H 8 1 6 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 6 b ( t x t H 8 1 6 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 1 6 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 1 6 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 1 6 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 6 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 1 6 c ( d _ r d o g r p H 8 1 6 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 1 6 d ( t x t H 8 1 6 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 2 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 2 1 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 2 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 2 1 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 2 1 a ( d _ r d o g r p H 8 2 1 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 2 1 b ( t x t H 8 2 1 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 2 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 2 1 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 2 1 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 2 1 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 2 1 c ( d _ r d o g r p H 8 2 1 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 2 1 d ( t x t H 8 2 1 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 3 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 3 1 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 3 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 1 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 3 1 a ( d _ r d o g r p H 8 3 1 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 3 1 b ( t x t H 8 3 1 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 3 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 3 1 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 3 1 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 1 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 3 1 c ( d _ r d o g r p H 8 3 1 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 3 1 d ( t x t H 8 3 1 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 3 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 3 2 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 3 2 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 2 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 3 2 a ( d _ r d o g r p H 8 3 2 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 3 2 b ( t x t H 8 3 2 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 3 2 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 3 2 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 3 2 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 2 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 3 2 c ( d _ r d o g r p H 8 3 2 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 3 2 d ( t x t H 8 3 2 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 4 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 4 1 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 4 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 1 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 4 1 a ( d _ r d o g r p H 8 4 1 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 4 1 b ( t x t H 8 4 1 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 4 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 4 1 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 4 1 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 1 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 4 1 c ( d _ r d o g r p H 8 4 1 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 4 1 d ( t x t H 8 4 1 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 4 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 4 2 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 4 2 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 2 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 4 2 a ( d _ r d o g r p H 8 4 2 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 4 2 b ( t x t H 8 4 2 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 4 2 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 4 2 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 4 2 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 2 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 4 2 c ( d _ r d o g r p H 8 4 2 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 4 2 d ( t x t H 8 4 2 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 5 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 5 1 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 5 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 5 1 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 5 1 a ( d _ r d o g r p H 8 5 1 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 5 1 b ( t x t H 8 5 1 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 5 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 5 1 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 5 1 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 5 1 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 5 1 c ( d _ r d o g r p H 8 5 1 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 5 1 d ( t x t H 8 5 1 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 6 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 6 1 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 6 1 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 1 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 6 1 a ( d _ r d o g r p H 8 6 1 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 6 1 b ( t x t H 8 6 1 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 6 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 6 1 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 6 1 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 1 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 6 1 c ( d _ r d o g r p H 8 6 1 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 6 1 d ( t x t H 8 6 1 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 6 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                   o b j S a v e . s e t H 8 6 2 a ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 6 2 a . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 2 a . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 6 2 a ( d _ r d o g r p H 8 6 2 a [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 6 2 b ( t x t H 8 6 2 b . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   S t r i n g [ ]   d _ r d o g r p H 8 6 2 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                   o b j S a v e . s e t H 8 6 2 c ( " " ) ; 
 
                   f o r   ( i n t   i   =   0 ;   i   <   r d o g r p H 8 6 2 c . g e t C h i l d C o u n t ( ) ;   i + + ) 
 
                   { 
 
                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 2 c . g e t C h i l d A t ( i ) ; 
 
                           i f   ( r b . i s C h e c k e d ( ) )   o b j S a v e . s e t H 8 6 2 c ( d _ r d o g r p H 8 6 2 c [ i ] ) ; 
 
                   } 
 
 
 
                   o b j S a v e . s e t H 8 6 2 d ( t x t H 8 6 2 d . g e t T e x t ( ) . t o S t r i n g ( ) ) ; 
 
                   o b j S a v e . s e t S t a r t T i m e ( S t a r t T i m e ) ; 
 
                   o b j S a v e . s e t E n d T i m e ( g . C u r r e n t T i m e 2 4 ( ) ) ; 
 
                   o b j S a v e . s e t U s e r I d ( g . g e t U s e r I d ( ) ) ; 
 
                   o b j S a v e . s e t E n t r y U s e r ( g . g e t U s e r I d ( ) ) ;   / / f r o m   d a t a   e n t r y   u s e r   l i s t 
 
                   / / o b j S a v e . s e t L a t ( D o u b l e . t o S t r i n g ( c u r r e n t L a t i t u d e ) ) ; 
 
                   / / o b j S a v e . s e t L o n ( D o u b l e . t o S t r i n g ( c u r r e n t L o n g i t u d e ) ) ; 
 
 
 
                   S t r i n g   s t a t u s   =   o b j S a v e . S a v e U p d a t e D a t a ( t h i s ) ; 
 
                   i f ( s t a t u s . l e n g t h ( ) = = 0 )   { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   " S a v e d   S u c c e s s f u l l y " ) ; 
 
                   } 
 
                   e l s e { 
 
                           C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   s t a t u s ) ; 
 
                           r e t u r n ; 
 
                   } 
 
           } 
 
           c a t c h ( E x c e p t i o n     e ) 
 
           { 
 
                   C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   e . g e t M e s s a g e ( ) ) ; 
 
                   r e t u r n ; 
 
           } 
 
   } 
 
 
 
   p r i v a t e   v o i d   D a t a S e a r c h ( S t r i n g   R n d ,   S t r i n g   S u c h a n a I D ) 
 
           { 
 
               t r y 
 
                 { 
 
           
 
                       R a d i o B u t t o n   r b ; 
 
                       C o s t 1 _ D a t a M o d e l   d   =   n e w   C o s t 1 _ D a t a M o d e l ( ) ; 
 
                       S t r i n g   S Q L   =   " S e l e c t   *   f r o m   " +   T a b l e N a m e   + "     W h e r e   R n d = ' " +   R n d   + " '   a n d   S u c h a n a I D = ' " +   S u c h a n a I D   + " ' " ; 
 
                       L i s t < C o s t 1 _ D a t a M o d e l >   d a t a   =   d . S e l e c t A l l ( t h i s ,   S Q L ) ; 
 
                       f o r ( C o s t 1 _ D a t a M o d e l   i t e m   :   d a t a ) { 
 
                           t x t R n d . s e t T e x t ( i t e m . g e t R n d ( ) ) ; 
 
                           t x t S u c h a n a I D . s e t T e x t ( i t e m . g e t S u c h a n a I D ( ) ) ; 
 
                           t x t M S l N o . s e t T e x t ( i t e m . g e t M S l N o ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 1 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 1 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 1 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 1 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 1 b . s e t T e x t ( i t e m . g e t H 8 1 1 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 1 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 1 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 1 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 1 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 1 d . s e t T e x t ( i t e m . g e t H 8 1 1 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 2 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 2 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 2 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 2 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 2 b . s e t T e x t ( i t e m . g e t H 8 1 2 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 2 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 2 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 2 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 2 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 2 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 2 d . s e t T e x t ( i t e m . g e t H 8 1 2 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 3 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 3 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 3 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 3 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 3 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 3 b . s e t T e x t ( i t e m . g e t H 8 1 3 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 3 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 3 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 3 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 3 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 3 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 3 d . s e t T e x t ( i t e m . g e t H 8 1 3 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 4 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 4 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 4 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 4 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 4 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 4 b . s e t T e x t ( i t e m . g e t H 8 1 4 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 4 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 4 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 4 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 4 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 4 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 4 d . s e t T e x t ( i t e m . g e t H 8 1 4 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 5 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 5 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 5 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 5 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 5 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 5 b . s e t T e x t ( i t e m . g e t H 8 1 5 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 5 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 5 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 5 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 5 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 5 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 5 d . s e t T e x t ( i t e m . g e t H 8 1 5 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 6 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 6 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 6 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 6 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 6 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 6 b . s e t T e x t ( i t e m . g e t H 8 1 6 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 1 6 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 1 6 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 1 6 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 1 6 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 1 6 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 1 6 d . s e t T e x t ( i t e m . g e t H 8 1 6 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 2 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 2 1 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 2 1 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 2 1 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 2 1 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 2 1 b . s e t T e x t ( i t e m . g e t H 8 2 1 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 2 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 2 1 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 2 1 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 2 1 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 2 1 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 2 1 d . s e t T e x t ( i t e m . g e t H 8 2 1 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 3 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 3 1 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 3 1 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 3 1 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 1 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 3 1 b . s e t T e x t ( i t e m . g e t H 8 3 1 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 3 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 3 1 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 3 1 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 3 1 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 1 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 3 1 d . s e t T e x t ( i t e m . g e t H 8 3 1 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 3 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 3 2 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 3 2 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 3 2 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 2 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 3 2 b . s e t T e x t ( i t e m . g e t H 8 3 2 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 3 2 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 3 2 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 3 2 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 3 2 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 3 2 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 3 2 d . s e t T e x t ( i t e m . g e t H 8 3 2 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 4 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 4 1 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 4 1 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 4 1 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 1 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 4 1 b . s e t T e x t ( i t e m . g e t H 8 4 1 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 4 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 4 1 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 4 1 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 4 1 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 1 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 4 1 d . s e t T e x t ( i t e m . g e t H 8 4 1 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 4 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 4 2 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 4 2 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 4 2 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 2 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 4 2 b . s e t T e x t ( i t e m . g e t H 8 4 2 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 4 2 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 4 2 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 4 2 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 4 2 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 4 2 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 4 2 d . s e t T e x t ( i t e m . g e t H 8 4 2 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 5 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 5 1 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 5 1 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 5 1 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 5 1 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 5 1 b . s e t T e x t ( i t e m . g e t H 8 5 1 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 5 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 5 1 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 5 1 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 5 1 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 5 1 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 5 1 d . s e t T e x t ( i t e m . g e t H 8 5 1 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 6 1 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 6 1 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 6 1 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 6 1 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 1 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 6 1 b . s e t T e x t ( i t e m . g e t H 8 6 1 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 6 1 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 6 1 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 6 1 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 6 1 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 1 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 6 1 d . s e t T e x t ( i t e m . g e t H 8 6 1 d ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 6 2 a   =   n e w   S t r i n g [ ]   { " 1 " , " 0 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 6 2 a . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 6 2 a ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 6 2 a [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 2 a . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 6 2 b . s e t T e x t ( i t e m . g e t H 8 6 2 b ( ) ) ; 
 
                           S t r i n g [ ]   d _ r d o g r p H 8 6 2 c   =   n e w   S t r i n g [ ]   { " 1 " , " 2 " , " 3 " } ; 
 
                           f o r   ( i n t   i   =   0 ;   i   <   d _ r d o g r p H 8 6 2 c . l e n g t h ;   i + + ) 
 
                           { 
 
                                   i f   ( i t e m . g e t H 8 6 2 c ( ) . e q u a l s ( S t r i n g . v a l u e O f ( d _ r d o g r p H 8 6 2 c [ i ] ) ) ) 
 
                                   { 
 
                                           r b   =   ( R a d i o B u t t o n ) r d o g r p H 8 6 2 c . g e t C h i l d A t ( i ) ; 
 
                                           r b . s e t C h e c k e d ( t r u e ) ; 
 
                                   } 
 
                           } 
 
                           t x t H 8 6 2 d . s e t T e x t ( i t e m . g e t H 8 6 2 d ( ) ) ; 
 
                       } 
 
                 } 
 
                 c a t c h ( E x c e p t i o n     e ) 
 
                 { 
 
                         C o n n e c t i o n . M e s s a g e B o x ( C o s t 1 . t h i s ,   e . g e t M e s s a g e ( ) ) ; 
 
                         r e t u r n ; 
 
                 } 
 
           } 
 
 
 
 
 
 
 
   p r o t e c t e d   D i a l o g   o n C r e a t e D i a l o g ( i n t   i d )   { 
 
       f i n a l   C a l e n d a r   c   =   C a l e n d a r . g e t I n s t a n c e ( ) ; 
 
       h o u r   =   c . g e t ( C a l e n d a r . H O U R _ O F _ D A Y ) ; 
 
       m i n u t e   =   c . g e t ( C a l e n d a r . M I N U T E ) ; 
 
       s w i t c h   ( i d )   { 
 
               c a s e   D A T E _ D I A L O G : 
 
                       r e t u r n   n e w   D a t e P i c k e r D i a l o g ( t h i s ,   m D a t e S e t L i s t e n e r , g . m Y e a r , g . m M o n t h - 1 , g . m D a y ) ; 
 
               c a s e   T I M E _ D I A L O G : 
 
                       r e t u r n   n e w   T i m e P i c k e r D i a l o g ( t h i s ,   t i m e P i c k e r L i s t e n e r ,   h o u r ,   m i n u t e , f a l s e ) ; 
 
               } 
 
           r e t u r n   n u l l ; 
 
   } 
 
 
 
   p r i v a t e   D a t e P i c k e r D i a l o g . O n D a t e S e t L i s t e n e r   m D a t e S e t L i s t e n e r   =   n e w   D a t e P i c k e r D i a l o g . O n D a t e S e t L i s t e n e r ( )   { 
 
         p u b l i c   v o i d   o n D a t e S e t ( D a t e P i c k e r   v i e w ,   i n t   y e a r ,   i n t   m o n t h O f Y e a r ,   i n t   d a y O f M o n t h )   { 
 
             m Y e a r   =   y e a r ;   m M o n t h   =   m o n t h O f Y e a r + 1 ;   m D a y   =   d a y O f M o n t h ; 
 
             E d i t T e x t   d t p D a t e ; 
 
 
 
 
 
             d t p D a t e . s e t T e x t ( n e w   S t r i n g B u i l d e r ( ) 
 
             . a p p e n d ( G l o b a l . R i g h t ( " 0 0 " + m D a y , 2 ) ) . a p p e n d ( " / " ) 
 
             . a p p e n d ( G l o b a l . R i g h t ( " 0 0 " + m M o n t h , 2 ) ) . a p p e n d ( " / " ) 
 
             . a p p e n d ( m Y e a r ) ) ; 
 
             } 
 
     } ; 
 
 
 
   p r i v a t e   T i m e P i c k e r D i a l o g . O n T i m e S e t L i s t e n e r   t i m e P i c k e r L i s t e n e r   =   n e w   T i m e P i c k e r D i a l o g . O n T i m e S e t L i s t e n e r ( )   { 
 
         p u b l i c   v o i d   o n T i m e S e t ( T i m e P i c k e r   v i e w ,   i n t   s e l e c t e d H o u r ,   i n t   s e l e c t e d M i n u t e )   { 
 
               h o u r   =   s e l e c t e d H o u r ;   m i n u t e   =   s e l e c t e d M i n u t e ; 
 
               E d i t T e x t   t p T i m e ; 
 
 
 
 
 
                     t p T i m e . s e t T e x t ( n e w   S t r i n g B u i l d e r ( ) . a p p e n d ( G l o b a l . R i g h t ( " 0 0 " + h o u r , 2 ) ) . a p p e n d ( " : " ) . a p p e n d ( G l o b a l . R i g h t ( " 0 0 " + m i n u t e , 2 ) ) ) ; 
 
 
 
         } 
 
     } ; 
 
 
 
 
 
   / / G P S   R e a d i n g 
 
   / / . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 
 
   p u b l i c   v o i d   F i n d L o c a t i o n ( )   { 
 
   L o c a t i o n M a n a g e r   l o c a t i o n M a n a g e r   =   ( L o c a t i o n M a n a g e r )   t h i s . g e t S y s t e m S e r v i c e ( C o n t e x t . L O C A T I O N _ S E R V I C E ) ; 
 
 
 
   L o c a t i o n L i s t e n e r   l o c a t i o n L i s t e n e r   =   n e w   L o c a t i o n L i s t e n e r ( )   { 
 
           p u b l i c   v o i d   o n L o c a t i o n C h a n g e d ( L o c a t i o n   l o c a t i o n )   { 
 
                   u p d a t e L o c a t i o n ( l o c a t i o n ) ; 
 
           } 
 
           p u b l i c   v o i d   o n S t a t u s C h a n g e d ( S t r i n g   p r o v i d e r ,   i n t   s t a t u s ,   B u n d l e   e x t r a s )   { 
 
           } 
 
           p u b l i c   v o i d   o n P r o v i d e r E n a b l e d ( S t r i n g   p r o v i d e r )   { 
 
           } 
 
           p u b l i c   v o i d   o n P r o v i d e r D i s a b l e d ( S t r i n g   p r o v i d e r )   { 
 
           } 
 
       } ; 
 
     l o c a t i o n M a n a g e r . r e q u e s t L o c a t i o n U p d a t e s ( L o c a t i o n M a n a g e r . G P S _ P R O V I D E R ,   0 ,   0 ,   l o c a t i o n L i s t e n e r ) ; 
 
   } 
 
 
 
   v o i d   u p d a t e L o c a t i o n ( L o c a t i o n   l o c a t i o n )   { 
 
           c u r r e n t L o c a t i o n     =   l o c a t i o n ; 
 
           c u r r e n t L a t i t u d e     =   c u r r e n t L o c a t i o n . g e t L a t i t u d e ( ) ; 
 
           c u r r e n t L o n g i t u d e   =   c u r r e n t L o c a t i o n . g e t L o n g i t u d e ( ) ; 
 
   } 
 
 
 
 
 
   / /   M e t h o d   t o   t u r n   o n   G P S 
 
   p u b l i c   v o i d   t u r n G P S O n ( ) { 
 
           t r y 
 
           { 
 
                   S t r i n g   p r o v i d e r   =   S e t t i n g s . S e c u r e . g e t S t r i n g ( g e t C o n t e n t R e s o l v e r ( ) ,   S e t t i n g s . S e c u r e . L O C A T I O N _ P R O V I D E R S _ A L L O W E D ) ; 
 
                   i f ( ! p r o v i d e r . c o n t a i n s ( " g p s " ) ) {   / / i f   g p s   i s   d i s a b l e d 
 
                           f i n a l   I n t e n t   p o k e   =   n e w   I n t e n t ( ) ; 
 
                           p o k e . s e t C l a s s N a m e ( " c o m . a n d r o i d . s e t t i n g s " ,   " c o m . a n d r o i d . s e t t i n g s . w i d g e t . S e t t i n g s A p p W i d g e t P r o v i d e r " ) ; 
 
                           p o k e . a d d C a t e g o r y ( I n t e n t . C A T E G O R Y _ A L T E R N A T I V E ) ; 
 
                           p o k e . s e t D a t a ( U r i . p a r s e ( " 3 " ) ) ; 
 
                           s e n d B r o a d c a s t ( p o k e ) ; 
 
                   } 
 
           } 
 
           c a t c h   ( E x c e p t i o n   e )   { 
 
           } 
 
   } 
 
   
 
   / /   M e t h o d   t o   t u r n   o f f   t h e   G P S 
 
   p u b l i c   v o i d   t u r n G P S O f f ( ) { 
 
           S t r i n g   p r o v i d e r   =   S e t t i n g s . S e c u r e . g e t S t r i n g ( g e t C o n t e n t R e s o l v e r ( ) ,   S e t t i n g s . S e c u r e . L O C A T I O N _ P R O V I D E R S _ A L L O W E D ) ; 
 
   
 
           i f ( p r o v i d e r . c o n t a i n s ( " g p s " ) ) {   / / i f   g p s   i s   e n a b l e d 
 
                   f i n a l   I n t e n t   p o k e   =   n e w   I n t e n t ( ) ; 
 
                   p o k e . s e t C l a s s N a m e ( " c o m . a n d r o i d . s e t t i n g s " ,   " c o m . a n d r o i d . s e t t i n g s . w i d g e t . S e t t i n g s A p p W i d g e t P r o v i d e r " ) ; 
 
                   p o k e . a d d C a t e g o r y ( I n t e n t . C A T E G O R Y _ A L T E R N A T I V E ) ; 
 
                   p o k e . s e t D a t a ( U r i . p a r s e ( " 3 " ) ) ; 
 
                   s e n d B r o a d c a s t ( p o k e ) ; 
 
           } 
 
   } 
 
   
 
   / /   t u r n i n g   o f f   t h e   G P S   i f   i t s   i n   o n   s t a t e .   t o   a v o i d   t h e   b a t t e r y   d r a i n . 
 
   @ O v e r r i d e 
 
   p r o t e c t e d   v o i d   o n D e s t r o y ( )   { 
 
           / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b 
 
           s u p e r . o n D e s t r o y ( ) ; 
 
           t u r n G P S O f f ( ) ; 
 
   } 
 
 } 