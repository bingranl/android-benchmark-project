package com.android.example.module06_module333_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAE = com.android.example.module06_module333_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAC = com.android.example.module06_module333_module5.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module06_module333_module5.ClassAAD = com.android.example.module06_module333_module5.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module06_module333_module5.ClassAAA = com.android.example.module06_module333_module5.ClassAAA()
	private 	val instance_var_1_4: com.android.example.module06_module333_module5.ClassAAH = com.android.example.module06_module333_module5.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAA,
		param1: com.android.example.module06_module333_module5.ClassAAE
	) {
		for (iAb in 0..2) {
			if (kotlin.Any().equals(kotlin.Any())) {
				for (iAc in 0..4) {
					param0.method1(io.reactivex.subscribers.TestSubscriber())

					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.cancel()

				}
			} else {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onComplete()

		}
		param0.method1(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAA
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.isDisposed()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

	}
}
