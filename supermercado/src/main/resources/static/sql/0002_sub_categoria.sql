-- Table: public.sub_categoria

-- DROP TABLE public.sub_categoria;

CREATE TABLE public.sub_categoria
(
  id serial NOT NULL ,
  id_categoria integer NOT NULL,
  nome character varying(50) NOT NULL,
  CONSTRAINT sub_categoria_pkey PRIMARY KEY (id),
  CONSTRAINT sub_categoria_id_categoria FOREIGN KEY (id_categoria)
      REFERENCES public.categoria (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT sub_categoria_nome_key UNIQUE (nome)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.sub_categoria
  OWNER TO postgres;
