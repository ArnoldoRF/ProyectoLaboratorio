PGDMP     (                    z            Gobernacion    10.20    10.20 7    <           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            =           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            >           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            ?           1262    16514    Gobernacion    DATABASE     �   CREATE DATABASE "Gobernacion" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Venezuela.1252' LC_CTYPE = 'Spanish_Venezuela.1252';
    DROP DATABASE "Gobernacion";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            @           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            A           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16515 
   asistencia    TABLE     u   CREATE TABLE public.asistencia (
    cod_charla integer NOT NULL,
    cedula_benef character varying(12) NOT NULL
);
    DROP TABLE public.asistencia;
       public         postgres    false    3            �            1259    16518    beneficiario    TABLE     �   CREATE TABLE public.beneficiario (
    cedula_benef character varying(12) NOT NULL,
    nombre text NOT NULL,
    apellido text NOT NULL,
    telefono character varying(12) NOT NULL,
    estatus "char"
);
     DROP TABLE public.beneficiario;
       public         postgres    false    3            �            1259    16524    charla    TABLE       CREATE TABLE public.charla (
    cod_charla integer NOT NULL,
    rif_organismo character varying(16) NOT NULL,
    tema text NOT NULL,
    fecha date NOT NULL,
    hora time(6) without time zone NOT NULL,
    lugar text NOT NULL,
    estatus "char" NOT NULL
);
    DROP TABLE public.charla;
       public         postgres    false    3            �            1259    16530 	   fundacion    TABLE     �   CREATE TABLE public.fundacion (
    cod_fund integer NOT NULL,
    nombre_fund text NOT NULL,
    presupuesto double precision NOT NULL,
    estatus "char" NOT NULL
);
    DROP TABLE public.fundacion;
       public         postgres    false    3            �            1259    16536 	   organismo    TABLE     �   CREATE TABLE public.organismo (
    rif_organismo character varying(16) NOT NULL,
    direccion character varying(255) NOT NULL,
    estatus "char" NOT NULL
);
    DROP TABLE public.organismo;
       public         postgres    false    3            �            1259    16539    responsable    TABLE     �   CREATE TABLE public.responsable (
    cedula_res character varying(12) NOT NULL,
    nombre text NOT NULL,
    apellido text NOT NULL,
    cod_fund integer NOT NULL,
    telefono character varying(12) NOT NULL,
    estatus "char" NOT NULL
);
    DROP TABLE public.responsable;
       public         postgres    false    3            �            1259    16545 	   serv_fund    TABLE     d   CREATE TABLE public.serv_fund (
    cod_servicio integer NOT NULL,
    cod_fund integer NOT NULL
);
    DROP TABLE public.serv_fund;
       public         postgres    false    3            �            1259    16548    servicio    TABLE     �   CREATE TABLE public.servicio (
    cod_servicio integer NOT NULL,
    nomb_servicio text NOT NULL,
    costo double precision NOT NULL,
    estatus "char" NOT NULL
);
    DROP TABLE public.servicio;
       public         postgres    false    3            �            1259    16554 	   solicitud    TABLE     L  CREATE TABLE public.solicitud (
    cod_solic integer NOT NULL,
    cedula_res character varying(12) NOT NULL,
    cedula_benef character varying(12) NOT NULL,
    cod_fund integer NOT NULL,
    prioridad character varying(6) NOT NULL,
    fecha_creacion date NOT NULL,
    fecha_aprob date NOT NULL,
    estatus "char" NOT NULL
);
    DROP TABLE public.solicitud;
       public         postgres    false    3            �            1259    16557    solicitud_servicio    TABLE     �   CREATE TABLE public.solicitud_servicio (
    cod_solic integer NOT NULL,
    cod_servicio integer NOT NULL,
    costo_total double precision NOT NULL
);
 &   DROP TABLE public.solicitud_servicio;
       public         postgres    false    3            0          0    16515 
   asistencia 
   TABLE DATA               >   COPY public.asistencia (cod_charla, cedula_benef) FROM stdin;
    public       postgres    false    196   �?       1          0    16518    beneficiario 
   TABLE DATA               Y   COPY public.beneficiario (cedula_benef, nombre, apellido, telefono, estatus) FROM stdin;
    public       postgres    false    197   �?       2          0    16524    charla 
   TABLE DATA               ^   COPY public.charla (cod_charla, rif_organismo, tema, fecha, hora, lugar, estatus) FROM stdin;
    public       postgres    false    198   N@       3          0    16530 	   fundacion 
   TABLE DATA               P   COPY public.fundacion (cod_fund, nombre_fund, presupuesto, estatus) FROM stdin;
    public       postgres    false    199   �@       4          0    16536 	   organismo 
   TABLE DATA               F   COPY public.organismo (rif_organismo, direccion, estatus) FROM stdin;
    public       postgres    false    200   �A       5          0    16539    responsable 
   TABLE DATA               `   COPY public.responsable (cedula_res, nombre, apellido, cod_fund, telefono, estatus) FROM stdin;
    public       postgres    false    201   �A       6          0    16545 	   serv_fund 
   TABLE DATA               ;   COPY public.serv_fund (cod_servicio, cod_fund) FROM stdin;
    public       postgres    false    202   VB       7          0    16548    servicio 
   TABLE DATA               O   COPY public.servicio (cod_servicio, nomb_servicio, costo, estatus) FROM stdin;
    public       postgres    false    203   �B       8          0    16554 	   solicitud 
   TABLE DATA               �   COPY public.solicitud (cod_solic, cedula_res, cedula_benef, cod_fund, prioridad, fecha_creacion, fecha_aprob, estatus) FROM stdin;
    public       postgres    false    204   UC       9          0    16557    solicitud_servicio 
   TABLE DATA               R   COPY public.solicitud_servicio (cod_solic, cod_servicio, costo_total) FROM stdin;
    public       postgres    false    205   �C       �
           2606    16561    beneficiario Beneficiario_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.beneficiario
    ADD CONSTRAINT "Beneficiario_pkey" PRIMARY KEY (cedula_benef);
 J   ALTER TABLE ONLY public.beneficiario DROP CONSTRAINT "Beneficiario_pkey";
       public         postgres    false    197            �
           2606    16563    charla Charla_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.charla
    ADD CONSTRAINT "Charla_pkey" PRIMARY KEY (cod_charla);
 >   ALTER TABLE ONLY public.charla DROP CONSTRAINT "Charla_pkey";
       public         postgres    false    198            �
           2606    16565    fundacion Fundacion_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.fundacion
    ADD CONSTRAINT "Fundacion_pkey" PRIMARY KEY (cod_fund);
 D   ALTER TABLE ONLY public.fundacion DROP CONSTRAINT "Fundacion_pkey";
       public         postgres    false    199            �
           2606    16567    organismo Organismo_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.organismo
    ADD CONSTRAINT "Organismo_pkey" PRIMARY KEY (rif_organismo);
 D   ALTER TABLE ONLY public.organismo DROP CONSTRAINT "Organismo_pkey";
       public         postgres    false    200            �
           2606    16569    responsable Responsable_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.responsable
    ADD CONSTRAINT "Responsable_pkey" PRIMARY KEY (cedula_res);
 H   ALTER TABLE ONLY public.responsable DROP CONSTRAINT "Responsable_pkey";
       public         postgres    false    201            �
           2606    16571    servicio Servicio_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.servicio
    ADD CONSTRAINT "Servicio_pkey" PRIMARY KEY (cod_servicio);
 B   ALTER TABLE ONLY public.servicio DROP CONSTRAINT "Servicio_pkey";
       public         postgres    false    203            �
           2606    16573    solicitud Solicitud_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.solicitud
    ADD CONSTRAINT "Solicitud_pkey" PRIMARY KEY (cod_solic);
 D   ALTER TABLE ONLY public.solicitud DROP CONSTRAINT "Solicitud_pkey";
       public         postgres    false    204            �
           1259    16574    fki_AsisCharla_Fk    INDEX     P   CREATE INDEX "fki_AsisCharla_Fk" ON public.asistencia USING btree (cod_charla);
 '   DROP INDEX public."fki_AsisCharla_Fk";
       public         postgres    false    196            �
           1259    16575    fki_Fund_Fk    INDEX     G   CREATE INDEX "fki_Fund_Fk" ON public.serv_fund USING btree (cod_fund);
 !   DROP INDEX public."fki_Fund_Fk";
       public         postgres    false    202            �
           1259    16576    fki_InterSer_Fk    INDEX     X   CREATE INDEX "fki_InterSer_Fk" ON public.solicitud_servicio USING btree (cod_servicio);
 %   DROP INDEX public."fki_InterSer_Fk";
       public         postgres    false    205            �
           1259    16577    fki_InterSolic.Fk    INDEX     W   CREATE INDEX "fki_InterSolic.Fk" ON public.solicitud_servicio USING btree (cod_solic);
 '   DROP INDEX public."fki_InterSolic.Fk";
       public         postgres    false    205            �
           1259    16578    fki_R    INDEX     C   CREATE INDEX "fki_R" ON public.solicitud USING btree (cedula_res);
    DROP INDEX public."fki_R";
       public         postgres    false    204            �
           1259    16579    fki_RespFund_Fk    INDEX     M   CREATE INDEX "fki_RespFund_Fk" ON public.responsable USING btree (cod_fund);
 %   DROP INDEX public."fki_RespFund_Fk";
       public         postgres    false    201            �
           1259    16580    fki_Serv_Fk    INDEX     K   CREATE INDEX "fki_Serv_Fk" ON public.serv_fund USING btree (cod_servicio);
 !   DROP INDEX public."fki_Serv_Fk";
       public         postgres    false    202            �
           1259    16581    fki_SoliBenf_Fk    INDEX     O   CREATE INDEX "fki_SoliBenf_Fk" ON public.solicitud USING btree (cedula_benef);
 %   DROP INDEX public."fki_SoliBenf_Fk";
       public         postgres    false    204            �
           1259    16582    fki_SoliFund_Fk    INDEX     K   CREATE INDEX "fki_SoliFund_Fk" ON public.solicitud USING btree (cod_fund);
 %   DROP INDEX public."fki_SoliFund_Fk";
       public         postgres    false    204            �
           1259    16583    fki_a    INDEX     D   CREATE INDEX fki_a ON public.asistencia USING btree (cedula_benef);
    DROP INDEX public.fki_a;
       public         postgres    false    196            �
           2606    16584    asistencia AsisBenef_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.asistencia
    ADD CONSTRAINT "AsisBenef_Fk" FOREIGN KEY (cedula_benef) REFERENCES public.beneficiario(cedula_benef) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 C   ALTER TABLE ONLY public.asistencia DROP CONSTRAINT "AsisBenef_Fk";
       public       postgres    false    197    2712    196            �
           2606    16589    asistencia AsisCharla_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.asistencia
    ADD CONSTRAINT "AsisCharla_Fk" FOREIGN KEY (cod_charla) REFERENCES public.charla(cod_charla) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 D   ALTER TABLE ONLY public.asistencia DROP CONSTRAINT "AsisCharla_Fk";
       public       postgres    false    196    2714    198            �
           2606    16594    serv_fund Fund_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.serv_fund
    ADD CONSTRAINT "Fund_Fk" FOREIGN KEY (cod_fund) REFERENCES public.fundacion(cod_fund) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 =   ALTER TABLE ONLY public.serv_fund DROP CONSTRAINT "Fund_Fk";
       public       postgres    false    2716    199    202            �
           2606    16599    solicitud_servicio InterSer_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.solicitud_servicio
    ADD CONSTRAINT "InterSer_Fk" FOREIGN KEY (cod_servicio) REFERENCES public.servicio(cod_servicio) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 J   ALTER TABLE ONLY public.solicitud_servicio DROP CONSTRAINT "InterSer_Fk";
       public       postgres    false    2725    205    203            �
           2606    16604     solicitud_servicio InterSolic.Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.solicitud_servicio
    ADD CONSTRAINT "InterSolic.Fk" FOREIGN KEY (cod_solic) REFERENCES public.solicitud(cod_solic) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 L   ALTER TABLE ONLY public.solicitud_servicio DROP CONSTRAINT "InterSolic.Fk";
       public       postgres    false    205    2727    204            �
           2606    16609    responsable RespFund_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.responsable
    ADD CONSTRAINT "RespFund_Fk" FOREIGN KEY (cod_fund) REFERENCES public.fundacion(cod_fund) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 C   ALTER TABLE ONLY public.responsable DROP CONSTRAINT "RespFund_Fk";
       public       postgres    false    199    2716    201            �
           2606    16614    serv_fund Serv_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.serv_fund
    ADD CONSTRAINT "Serv_Fk" FOREIGN KEY (cod_servicio) REFERENCES public.servicio(cod_servicio) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 =   ALTER TABLE ONLY public.serv_fund DROP CONSTRAINT "Serv_Fk";
       public       postgres    false    202    203    2725            �
           2606    16619    solicitud SoliBenf_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.solicitud
    ADD CONSTRAINT "SoliBenf_Fk" FOREIGN KEY (cedula_benef) REFERENCES public.beneficiario(cedula_benef) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 A   ALTER TABLE ONLY public.solicitud DROP CONSTRAINT "SoliBenf_Fk";
       public       postgres    false    2712    204    197            �
           2606    16624    solicitud SoliFund_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.solicitud
    ADD CONSTRAINT "SoliFund_Fk" FOREIGN KEY (cod_fund) REFERENCES public.fundacion(cod_fund) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 A   ALTER TABLE ONLY public.solicitud DROP CONSTRAINT "SoliFund_Fk";
       public       postgres    false    204    2716    199            �
           2606    16629    solicitud SoliResp_Fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.solicitud
    ADD CONSTRAINT "SoliResp_Fk" FOREIGN KEY (cedula_res) REFERENCES public.responsable(cedula_res) ON UPDATE CASCADE ON DELETE CASCADE NOT VALID;
 A   ALTER TABLE ONLY public.solicitud DROP CONSTRAINT "SoliResp_Fk";
       public       postgres    false    2720    201    204            0      x�3400�42716356����� ""      1   �   x�-�1
1��zr��L23����`a#ؤH!,H��<����Ōb��x����N��\J���Ɋ(�
��V����j�ڥ��H΢��]`��K�/8�yM��Բkt�st�������jM��zB�7��1�B(v      2   �   x�5��
�0�s�{�J�5oÃG��*��n��V!�@��BDxkbc}�p-yN�t��$�W`d�4Y wA���+�)��M1�bﴅq�_ٗn,B��� �&<�.U��#o��'����m?�cN{�)6��H@��2-5G��z��R?�
6,      3   t   x�]�;�0��)� 2�8 ��y�"#���)r{� �yқ�ң� �l,�ػ�7�E�u:��;CrҠִ��{Ow7��M���Xb���FG��/?~�u�0���_Zh>���9�N�0�      4   B   x���54215��4ӵ�tN��IUp�t���54�051427�5��;��ML�,-�����@�=... �?�      5   s   x��1�0F���]�j�NT��.�]�6��ީG�b5���4
q����c�����x*3:�52Q£,�`8��~��H��ƒ1���-�mZї�u�p1��2`��8��V%      6   B   x�-ʹ 1��[�+�i���ap	#v�.)�aΰV�;���(��"�(��b�)��b�)?����I�      7   �   x�E�;�0D��)|D>Nj�(h%��^E�l��:R��9�v�Ҿ7����+'�BA��[�x�0�ᢆ��8���G��)���c�s��
�θ�v^,f���c���	�$�ԑ���{��y�'��F�.[]j����q��^(ъ�V�:)�~=�      8   d   x�E˻�@�x��	��'�g���
�>��M0�TaF����Jo�Tr�敮��E:+�B���~��jW��{�G�Q�Ǽ�ߙ8峉�0�      9   5   x�=Ʊ  ���d��C�0ULU��<a��ߪ�wI)�E����0q�g�
/     