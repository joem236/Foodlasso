--
-- PostgreSQL database dump
--

SET client_encoding = 'UTF8';
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'Standard public schema';


--
-- Name: plpgsql; Type: PROCEDURAL LANGUAGE; Schema: -; Owner: 
--

CREATE PROCEDURAL LANGUAGE plpgsql;


SET search_path = public, pg_catalog;

--
-- Name: category_id_seq; Type: SEQUENCE; Schema: public; Owner: foodlasso
--

CREATE SEQUENCE category_id_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.category_id_seq OWNER TO foodlasso;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: category_tbl; Type: TABLE; Schema: public; Owner: foodlasso; Tablespace: 
--

CREATE TABLE category_tbl (
    id integer DEFAULT nextval('category_id_seq'::regclass) NOT NULL,
    company_id integer DEFAULT 0 NOT NULL,
    menu_id integer DEFAULT 0 NOT NULL,
    parent_id integer DEFAULT 0 NOT NULL,
    name character varying,
    mime_type character varying(255) DEFAULT 'text/plain'::character varying NOT NULL,
    description character varying(255) DEFAULT ''::character varying,
    "position" integer DEFAULT 0 NOT NULL
);


ALTER TABLE public.category_tbl OWNER TO foodlasso;

--
-- Name: company_id_seq; Type: SEQUENCE; Schema: public; Owner: foodlasso
--

CREATE SEQUENCE company_id_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.company_id_seq OWNER TO foodlasso;

--
-- Name: company_tbl; Type: TABLE; Schema: public; Owner: foodlasso; Tablespace: 
--

CREATE TABLE company_tbl (
    id integer DEFAULT nextval('company_id_seq'::regclass) NOT NULL,
    name character varying(255) DEFAULT ''::character varying NOT NULL,
    address character varying(255) DEFAULT ''::character varying NOT NULL,
    locality character varying(255) DEFAULT ''::character varying NOT NULL,
    region character varying(255) DEFAULT ''::character varying NOT NULL,
    country character varying(255) DEFAULT ''::character varying NOT NULL,
    postcode character varying(255) DEFAULT ''::character varying NOT NULL,
    tel character varying(255) DEFAULT ''::character varying NOT NULL,
    category character varying(255) DEFAULT ''::character varying NOT NULL,
    website character varying(255) DEFAULT ''::character varying NOT NULL,
    latitude numeric(12,6),
    longitude numeric(12,6),
    alcohol character varying(255) DEFAULT ''::character varying NOT NULL,
    takeout character varying(255) DEFAULT ''::character varying NOT NULL,
    delivery character varying(255) DEFAULT ''::character varying NOT NULL,
    alcohol_bool character varying(255),
    distance numeric(12,6),
    parking character varying(255),
    good_for_kids character varying(255),
    cash_only character varying(255),
    parking_bool character varying(255),
    meals character varying(255) DEFAULT ''::character varying NOT NULL,
    lunch character varying(255),
    dinner character varying(255),
    bar character varying(255),
    parking_garage character varying(255),
    parking_good character varying(255),
    parking_lot character varying(255),
    email character varying(255) DEFAULT ''::character varying NOT NULL,
    parking_free character varying(255),
    breakfast character varying(255),
    vegan_options character varying(255) DEFAULT ''::character varying NOT NULL,
    vegetarian_options character varying(255) DEFAULT ''::character varying NOT NULL,
    wifi character varying(255),
    alcohol_beer_wine character varying(255) DEFAULT ''::character varying NOT NULL,
    address_extended character varying(255) DEFAULT ''::character varying NOT NULL,
    reservations character varying(255) DEFAULT ''::character varying NOT NULL,
    alcohol_byob character varying(255) DEFAULT ''::character varying NOT NULL,
    wheelchair_access character varying(255) DEFAULT ''::character varying NOT NULL,
    factual_id character varying(255)
);


ALTER TABLE public.company_tbl OWNER TO foodlasso;

--
-- Name: item_id_seq; Type: SEQUENCE; Schema: public; Owner: foodlasso
--

CREATE SEQUENCE item_id_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.item_id_seq OWNER TO foodlasso;

--
-- Name: item_tbl; Type: TABLE; Schema: public; Owner: foodlasso; Tablespace: 
--

CREATE TABLE item_tbl (
    id integer DEFAULT nextval('item_id_seq'::regclass) NOT NULL,
    company_id integer DEFAULT 0 NOT NULL,
    menu_id integer DEFAULT 0 NOT NULL,
    category_id integer DEFAULT 0 NOT NULL,
    name character varying(255) NOT NULL,
    description character varying NOT NULL,
    price money,
    "template" text,
    mime_type character varying(255) DEFAULT 'text/plain'::character varying NOT NULL,
    topping boolean DEFAULT false NOT NULL,
    "position" integer DEFAULT 0 NOT NULL
);


ALTER TABLE public.item_tbl OWNER TO foodlasso;

--
-- Name: menu_id_seq; Type: SEQUENCE; Schema: public; Owner: foodlasso
--

CREATE SEQUENCE menu_id_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.menu_id_seq OWNER TO foodlasso;

--
-- Name: menu_tbl; Type: TABLE; Schema: public; Owner: foodlasso; Tablespace: 
--

CREATE TABLE menu_tbl (
    id integer DEFAULT nextval('menu_id_seq'::regclass) NOT NULL,
    company_id integer DEFAULT 0 NOT NULL,
    name character varying(255) NOT NULL,
    description character varying NOT NULL,
    date_active timestamp without time zone DEFAULT now(),
    date_inactive timestamp without time zone,
    time_active integer,
    time_inactive integer,
    recurring boolean DEFAULT false,
    special boolean DEFAULT false,
    active boolean DEFAULT true,
    published_id integer DEFAULT 0 NOT NULL,
    published_ts timestamp without time zone,
    changed boolean DEFAULT false NOT NULL,
    original_menu_id integer DEFAULT 0 NOT NULL,
    published boolean DEFAULT false NOT NULL
);


ALTER TABLE public.menu_tbl OWNER TO foodlasso;

--
-- Name: pricing_id_seq; Type: SEQUENCE; Schema: public; Owner: foodlasso
--

CREATE SEQUENCE pricing_id_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.pricing_id_seq OWNER TO foodlasso;

--
-- Name: pricing_tbl; Type: TABLE; Schema: public; Owner: foodlasso; Tablespace: 
--

CREATE TABLE pricing_tbl (
    id integer DEFAULT nextval('pricing_id_seq'::regclass) NOT NULL,
    company_id integer DEFAULT 0 NOT NULL,
    category_id integer DEFAULT 0 NOT NULL,
    item_id integer NOT NULL,
    "position" integer DEFAULT 0 NOT NULL,
    name character varying(255) NOT NULL,
    price money,
    menu_id integer DEFAULT 0 NOT NULL
);


ALTER TABLE public.pricing_tbl OWNER TO foodlasso;

CREATE SEQUENCE user_id_seq
       INCREMENT BY 1
       NO MAXVALUE
       NO MINVALUE
       CACHE 1;
ALTER TABLE public.user_id_seq OWNER TO foodlasso;

CREATE TABLE user_tbl (
       id integer DEFAULT nextval('user_id_seq') NOT NULL,
       company_id integer DEFAULT 0 NOT NULL,
       first_name varchar(65),
       last_name varchar(120),
       username varchar(65) NOT NULL DEFAULT '',
       password varchar(65) NOT NULL DEFAULT ''
);
