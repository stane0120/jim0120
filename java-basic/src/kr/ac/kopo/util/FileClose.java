package kr.ac.kopo.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

	public static void close(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(InputStream is, InputStream bis) {
		close(bis);
		close(is);
	}

	public static void close(OutputStream os, OutputStream bos) {
		close(bos);
		close(os);
	}

	public static void close(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Writer w) {
		if (w != null) {
			try {
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Reader r) {
		if (r != null) {
			try {
				r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Reader r, Reader br) {
		close(br);
		close(r);
	}

	public static void close(Writer w, Writer bw) {
		close(bw);
		close(w);
	}
}