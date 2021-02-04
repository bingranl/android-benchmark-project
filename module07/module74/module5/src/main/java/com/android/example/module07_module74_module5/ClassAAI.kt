package com.android.example.module07_module74_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAH = com.android.example.module06_module353_module2.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module353_module1.ClassAAA = com.android.example.module06_module353_module1.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module353_module1.ClassAAC = com.android.example.module06_module353_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAA,
		param1: com.android.example.module06_module353_module2.ClassAAI,
		param2: com.android.example.module06_module353_module2.ClassAAH,
		param3: com.android.example.module06_module353_module1.ClassAAC
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		for (iAb in 0..1) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.requestMore(1940287729096077186)

			local_var_3_0.onError(kotlin.Throwable())

			local_var_3_0.cancel()

		}
		param0.method1("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAD,
		param1: com.android.example.module06_module353_module1.ClassAAB,
		param2: com.android.example.module06_module353_module1.ClassAAI,
		param3: com.android.example.module06_module353_module2.ClassAAI
	) {
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module353_module1.ClassAAI,
		param1: com.android.example.module06_module353_module1.ClassAAJ
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

	}

	fun method3(
		param0: com.android.example.module06_module353_module1.ClassAAG,
		param1: com.android.example.module06_module353_module2.ClassAAE
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

		val local_var_2_3: okio.Timeout = okio.Timeout()
		local_var_2_3.clearDeadline()

		param0.method0(com.android.example.module06_module353_module2.ClassAAD(), com.android.example.module06_module353_module2.ClassAAE(), com.android.example.module06_module353_module2.ClassAAE(), com.android.example.module06_module353_module2.ClassAAH())

	}

	fun method4(
		param0: com.android.example.module06_module353_module1.ClassAAC,
		param1: com.android.example.module06_module353_module1.ClassAAH
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(8385966244512235947)

		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

	}
}
