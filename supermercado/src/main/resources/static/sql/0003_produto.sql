-- Table: public.produto

-- DROP TABLE public.produto;

CREATE TABLE public.produto
(
  id serial NOT NULL,
  nome character varying(50) NOT NULL unique,
  quantidade integer NOT NULL DEFAULT 0,
  valor numeric NOT NULL,
  id_categoria integer NOT NULL,
  codigo varchar(100) not null unique,
  id_sub_categoria integer NOT NULL,
  CONSTRAINT produto_pkey PRIMARY KEY (id),
  CONSTRAINT produto_id_categoria FOREIGN KEY (id_categoria)
      REFERENCES public.categoria (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT produto_id_sub_categoria FOREIGN KEY (id_sub_categoria)
      REFERENCES public.sub_categoria (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT produto_nome_key UNIQUE (nome)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.produto
  OWNER TO postgres;
