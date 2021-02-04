package com.android.example.module06_module313_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module313_module5.ClassAAG = com.android.example.module06_module313_module5.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module313_module5.ClassAAC = com.android.example.module06_module313_module5.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module313_module5.ClassAAC
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_0.clearTimeout()

		}
	}

	fun method1(
		param0: com.android.example.module06_module313_module5.ClassAAH
	) {
	}

	fun method2(
		param0: com.android.example.module06_module313_module5.ClassAAC
	) {
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.disposables.SerialDisposable())

		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.enter()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module06_module313_module5.ClassAAH,
		param1: com.android.example.module06_module313_module5.ClassAAE,
		param2: com.android.example.module06_module313_module5.ClassAAG
	) {
		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.exit()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.subscribers.TestSubscriber())

	}
}
